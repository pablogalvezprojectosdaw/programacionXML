
package com.mycompany.poryectoxml;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class UtilXML {
    
    public static String getXMLVideojuego (Videojuegos videojuegos) {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Videojuegos.class) ;
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //marshaller.marshal(videojuegos, System.out);
            StringWriter sw = new StringWriter();
            marshaller.marshal(videojuegos, sw);
            String result = sw.toString();
            return result;
        } catch (JAXBException ex) {
            System.out.println("Error" + ex.toString());
            return null;
        }
    }
    
    public static void VideojuegosToXmlFile (Videojuegos videojuegos) throws JAXBException {
        File fileXml = new File ("videojuegos.xml");
        JAXBContext contexto = JAXBContext.newInstance(Videojuegos.class) ;
        Marshaller marshaller = contexto.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(videojuegos, fileXml);
    }
    
}
