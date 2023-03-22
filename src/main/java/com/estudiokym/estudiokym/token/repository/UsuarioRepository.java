package com.estudiokym.estudiokym.token.repository;

import com.estudiokym.estudiokym.token.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByCuit(String cuit);
    
    /*List<Usuarioo> verUsus();
    void borrarUsus(Integer id);
    Usuarioo buscarUsu(Integer id);*/
    
    
}