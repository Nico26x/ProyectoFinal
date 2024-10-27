package co.edu.uniquindio.proyectoFinal.service;

import co.edu.uniquindio.proyectoFinal.model.Producto;

public interface ICrudProducto {

    boolean crearProducto(Producto newProducto);
    boolean eliminarProducto(String nombre);
    boolean actualizarProducto(String nombre, Producto producto);
    Producto buscarProducto(String nombre);
    boolean verificarProductoExistente(String nombre);


}
