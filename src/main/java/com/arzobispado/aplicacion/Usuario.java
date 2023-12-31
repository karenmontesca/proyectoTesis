package com.arzobispado.aplicacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;

    // getters y setters
}
