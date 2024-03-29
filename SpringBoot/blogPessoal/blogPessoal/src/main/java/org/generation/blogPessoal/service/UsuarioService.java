package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;
import org.generation.blogPessoal.model.Postagens;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.repository.PostagensRepository;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private PostagensRepository postagensRepo;
	
	public Optional<Usuario> cadastrarUsuario(Usuario usuario) {
		if(repository.findByUsuario(usuario.getUsuario()).isPresent()) {
			return null;
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		
		return Optional.ofNullable(repository.save(usuario));
	}
	
	public Optional<UsuarioLogin> logar(Optional<UsuarioLogin> user){
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);				
				user.get().setNome(usuario.get().getNome());
				
				return user;
			}
		}
		return null;
	}
	
	
	public Optional<Usuario> criarPostagens(Postagens post, Long idUsuario){
		if(repository.findById(idUsuario).isPresent()) {
			
			post.setCriadoPor(repository.findById(idUsuario).get());
			postagensRepo.save(post);
			return repository.findById(idUsuario);
		
		} else {
			
			return Optional.empty();
			
		}
	}
	
}
