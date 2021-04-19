
package com.mycompany.poryectoxml;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Videojuegos {
    private ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
    
    public Videojuegos (){
        
    }
    
    public ArrayList<Videojuego> getListaVideojuegos() {
        return listaVideojuegos;
    }
    
    @XmlElement (name = "videojuego") 
    public void setListaVideojuegos (ArrayList<Videojuego> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }
}
