module com.mycompany.poryectoxml {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    opens com.mycompany.poryectoxml to java.xml.bind;
    exports com.mycompany.poryectoxml;
}
