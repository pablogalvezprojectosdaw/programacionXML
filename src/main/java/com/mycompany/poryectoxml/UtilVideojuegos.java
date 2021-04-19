
package com.mycompany.poryectoxml;

import java.time.LocalDate;

public class UtilVideojuegos {
    
    public static Videojuegos crear() {
        Videojuego videojuego1 = new Videojuego("1234","Super Smash Bros. Ultimate","Lucha","Sora LTD.", "Nintendo", 60.00, true, LocalDate.of(2018,3,11));
        Videojuego videojuego2 = new Videojuego("1235","Super Mario Oddysey","plataformas","Nintendo", "Nintendo", 45.00, true, LocalDate.of(2018,4,12));
        
        Videojuegos videojuegos = new Videojuegos();
        videojuegos.getListaVideojuegos().add(videojuego1);
        videojuegos.getListaVideojuegos().add(videojuego2);
        
        return videojuegos;
    }
}
