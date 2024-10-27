package co.edu.uniquindio.proyectoFinal.service;

import co.edu.uniquindio.proyectoFinal.model.Administrador;

public interface ICrudAdministrador {

    boolean crearAdministrador(Administrador newAdministrador);
    boolean eliminarAdministrador(String usuario);
    boolean actualizarAdministrador(String usuario, Administrador newAdministrador);
    Administrador buscarAdministrador(String usuario);
    boolean verificarAdministradorExistente(String usuario);
}
