package com.estudiokym.estudiokym.token.service;

import com.estudiokym.estudiokym.token.entity.Usuario;
import java.util.List;

public interface IUsuService {
    public List<Usuario> verUsus();
    public void borrarUsu (Integer id);
    public Usuario buscarUsu (Integer id);
}