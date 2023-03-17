package com.estudiokym.estudiokym.token.repository;

import com.estudiokym.estudiokym.token.entity.Rol;
import com.estudiokym.estudiokym.token.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}