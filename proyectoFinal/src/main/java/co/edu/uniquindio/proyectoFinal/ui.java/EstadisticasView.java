package co.edu.uniquindio.proyectoFinal.ui;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;

public class EstadisticasView {

    public VBox getEstadisticasView() {
        // Crear gráfico de estadísticas
        PieChart pieChart = new PieChart();
        PieChart.Data slice1 = new PieChart.Data("Productos Vendidos", 50);
        PieChart.Data slice2 = new PieChart.Data("Productos Disponibles", 30);
        PieChart.Data slice3 = new PieChart.Data("Productos Cancelados", 20);

        pieChart.getData().addAll(slice1, slice2, slice3);

        // Layout del gráfico
        VBox layout = new VBox(pieChart);
        return layout;
    }
}

