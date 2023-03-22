package com.estudiokym.estudiokym.token.service;

import com.estudiokym.estudiokym.token.entity.UsuarioPrincipal;
import com.estudiokym.estudiokym.token.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UsuarioService usuServ;
    
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuServ.getByNombreUsuario(nombreUsuario).get();
        
        return UsuarioPrincipal.build(usuario);
    }
    
}