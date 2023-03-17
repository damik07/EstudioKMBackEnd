package com.estudiokym.estudiokym.token.dto;

import javax.validation.constraints.NotBlank;


public class LoginUsuario {
    
    @NotBlank
    private String nombreUsuario;
    
    @NotBlank
    private String cuit;
    
    @NotBlank
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
    
}