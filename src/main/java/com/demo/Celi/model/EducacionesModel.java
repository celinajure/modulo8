package com.demo.Celi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EducacionesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String lugar;
    private String telefono;
    private String email;
    private String domicilio;
    private String inicioFecha;
    private String finFecha;
    private String tipo;
    private Boolean estaHoy;

    public EducacionesModel() {
    }

    public EducacionesModel(Long id, String nombre, String lugar, String telefono, String email, String domicilio, String inicioFecha, String finFecha, String tipo, Boolean estaHoy) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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
