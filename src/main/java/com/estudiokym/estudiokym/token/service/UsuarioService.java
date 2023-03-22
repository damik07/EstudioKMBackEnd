package com.estudiokym.estudiokym.token.service;

import com.estudiokym.estudiokym.token.entity.Usuario;
import com.estudiokym.estudiokym.token.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService implements IUsuService{
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByCuit (String cuit){
        return usuarioRepository.existsByCuit(cuit);
    }
    
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    
    
    @Override
    public List<Usuario> verUsus() {
        return usuarioRepository.findAll();
    }

    @Override
    public void borrarUsu(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsu(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }
    
    
    
    
}