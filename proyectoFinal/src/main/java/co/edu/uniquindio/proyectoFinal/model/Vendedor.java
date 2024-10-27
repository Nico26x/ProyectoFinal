package co.edu.uniquindio.proyectoFinal.model;

import java.util.Collection;

public class Vendedor extends Persona{

    private Collection<Producto> listProductos;
    private Collection<Vendedor> listVendedoresAsociados;
    private Muro muro;
    private Collection<Chat> listChats;

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña, Usuario usuarioAsociado, String usuario, Collection<Producto> listProductos, Collection<Vendedor> listVendedoresAsociados, Muro muro, Collection<Chat> listChats) {
        super(nombre, apellidos, cedula, direccion, contraseña, usuarioAsociado, usuario);
        this.listProductos = listProductos;
        this.listVendedoresAsociados = listVendedoresAsociados;
        this.muro = muro;
        this.listChats = listChats;
    }

    public Collection<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(Collection<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public Collection<Vendedor> getListVendedoresAsociados() {
        return listVendedoresAsociados;
    }

    public void setListVendedoresAsociados(Collection<Vendedor> listVendedoresAsociados) {
        this.listVendedoresAsociados = listVendedoresAsociados;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public Collection<Chat> getListChats() {
        return listChats;
    }

    public void setListChats(Collection<Chat> listChats) {
        this.listChats = listChats;
    }
}
