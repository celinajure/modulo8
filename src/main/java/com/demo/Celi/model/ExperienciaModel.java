package com.demo.Celi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExperienciaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String telefono;
    private String email;
    private String url;
    private String inicioFecha;
    private String finFecha;
    private String tipo;
    private Boolean estaHoy;
    
    
    public ExperienciaModel() {
    }

    public ExperienciaModel(long id, String nombre, String telefono, String email, String url, String inicioFecha, String finFecha, String tipo, Boolean estaHoy) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.url = url;
        this.inicioFecha = inicioFecha;
        this.finFecha = finFecha;
        this.tipo = tipo;
        this.estaHoy = estaHoy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInicioFecha() {
        return inicioFecha;
    }

    public void setInicioFecha(String inicioFecha) {
        this.inicioFecha = inicioFecha;
    }

    public String getFinFecha() {
        return finFecha;
    }

    public void setFinFecha(String finFecha) {
        this.finFecha = finFecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstaHoy() {
        return estaHoy;
    }

    public void setEstaHoy(Boolean estaHoy) {
        this.estaHoy = estaHoy;
    }
    
    
}   
    
    

