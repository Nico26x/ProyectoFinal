package co.edu.uniquindio.proyectoFinal;

import co.edu.uniquindio.proyectoFinal.model.Persona;
import co.edu.uniquindio.proyectoFinal.model.Vendedor;
import co.edu.uniquindio.proyectoFinal.model.builder.PersonaBuilder;
import co.edu.uniquindio.proyectoFinal.model.builder.VendedorBuilder;
import co.edu.uniquindio.proyectoFinal.ui.MuroView;
import co.edu.uniquindio.proyectoFinal.ui.EstadisticasView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

    public class MainApp extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
    
        public static void main(String[] args) {
            launch(args);
        }

        @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();

        // Crear la vista del muro
        MuroView muroView = new MuroView();
        Tab muroTab = new Tab("Muro", muroView.getMuroView());

        // Crear la vista de estadísticas
        EstadisticasView estadisticasView = new EstadisticasView();
        Tab statsTab = new Tab("Estadísticas", estadisticasView.getEstadisticasView());

        // Añadir las pestañas al TabPane
        tabPane.getTabs().addAll(muroTab, statsTab);

        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setTitle("Marketplace - Red Social");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    }
    
