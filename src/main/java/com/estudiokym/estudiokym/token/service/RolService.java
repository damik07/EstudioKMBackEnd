package com.estudiokym.estudiokym.token.service;

import com.estudiokym.estudiokym.token.entity.Rol;
import com.estudiokym.estudiokym.token.enums.RolNombre;
import com.estudiokym.estudiokym.token.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepo.save(rol);
    }
}