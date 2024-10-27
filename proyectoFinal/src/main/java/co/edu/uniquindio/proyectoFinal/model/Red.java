package co.edu.uniquindio.proyectoFinal.model;

import java.util.Collection;

public class Red {

    private Usuario usuario;
    private Collection<Vendedor> listPersonas;
    private Administrador administrador;

    public Red(Usuario usuario, Collection<Vendedor> listPersonas, Administrador administrador) {
        this.usuario = usuario;
        this.listPersonas = listPersonas;
        this.administrador = administrador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Collection<Vendedor> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(Collection<Vendedor> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
