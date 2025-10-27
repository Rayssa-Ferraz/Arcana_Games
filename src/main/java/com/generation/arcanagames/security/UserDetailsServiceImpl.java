package com.generation.arcanagames.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.arcanagames.model.Usuario;
import com.generation.arcanagames.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(username == null || username.isEmpty()) {
            throw new UsernameNotFoundException("Username is empty");
        }
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario(username);
		
		if (usuario.isPresent()) {
            return new UserDetailsImpl(usuario.get());
        } else {
            throw new UsernameNotFoundException("Usuário não encontrado: " + username);
        }

	}
}
