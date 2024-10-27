package co.edu.uniquindio.proyectoFinal.service;

import co.edu.uniquindio.proyectoFinal.model.Vendedor;

public interface ICrudVendedor {

    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String usuario);
    boolean actualizarVendedor(String usuario, Vendedor vendedor);
    Vendedor buscarVendedor(String usuario);
    boolean verificarVendedorExistente(String usuario);
}
