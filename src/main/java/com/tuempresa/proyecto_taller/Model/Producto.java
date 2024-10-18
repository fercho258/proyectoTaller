package com.tuempresa.proyecto_taller.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity // Indica que la clse es una entidad JPA
public class Producto {

    @Id//Indica que campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autogenerar el ID

    //Definir los atributo de la entidad
    private Long id;
    private String nombre;
    private Double precio;

    // Getters y Setters
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
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

