module co.edu.uniquindio.co {

    requires javafx.controls;
    requires javafx.fxml;
    

    opens co.edu.uniquindio.proyectoFinal to javafx.fxml;
    exports co.edu.uniquindio.proyectoFinal;
}