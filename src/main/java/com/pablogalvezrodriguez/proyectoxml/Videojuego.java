
package com.pablogalvezrodriguez.proyectoxml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Videojuego {
    
    private String id;
    private String nombre;
    private String genero;
    private String desarrollador;
    private String distribuidor;
    private double precio;
    
    public Videojuego() {
        
    }
    
    public Videojuego(String id, String nombre, String genero, String desarrollador, String distribuidor, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.desarrollador = desarrollador;
        this.distribuidor = distribuidor;
        this.precio = precio;
        
        
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public String setNombre(String nombre) {
        return this.nombre;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public String setGenero(String genero) {
        return this.genero;
    }
    
    public String getDesarrollador() {
        return this.desarrollador;
    }
    
    public String setDesarrollador(String desarrollador) {
        return this.desarrollador;
    }
 
    public String getDistribuidor() {
        return this.distribuidor;
    }
    
    public String setDistribuidor(String distribuidor) {
        return this.distribuidor;
    }
    

}
