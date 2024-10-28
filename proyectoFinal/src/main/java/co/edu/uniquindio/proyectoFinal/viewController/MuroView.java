package co.edu.uniquindio.proyectoFinal.viewController;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class MuroView {

    public VBox getMuroView() {
        // Crear lista de productos en el muro
        ListView<String> muroList = new ListView<>();
        muroList.getItems().addAll(
            "Producto 1 - Vendedor A",
            "Producto 2 - Vendedor B",
            "Producto 3 - Vendedor A"
        );

        // Layout del muro
        VBox layout = new VBox(muroList);
        return layout;
    }
}
