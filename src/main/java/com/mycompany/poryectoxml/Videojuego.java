
package com.mycompany.poryectoxml;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlType(propOrder={"nombre","genero","desarrollador","distribuidor","precio","favorito", "fechaLanzamiento"})
public class Videojuego {
    
    private String id;
    private String nombre;
    private String genero;
    private String desarrollador;
    private String distribuidor;
    private double precio;
    private boolean favorito;
    private LocalDate fechaLanzamiento;
    
    public Videojuego() {
        
    }
    
    public Videojuego(String id, String nombre, String genero, String desarrollador, String distribuidor, double precio, boolean favorito, LocalDate fechaLanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.desarrollador = desarrollador;
        this.distribuidor = distribuidor;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
        
        
    }
    
    public String getId() {
        return this.id;
    }
    
    @XmlAttribute
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
    
    public double getPrecio() {
        return this.precio;
    }
    
    public double setPrecio (double precio) {
        return this.precio;
    }
    
    public boolean isFavorito() {
        return this.favorito;
    }
    
    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
}
