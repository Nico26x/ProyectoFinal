package co.edu.uniquindio.proyectoFinal.model.builder;

import co.edu.uniquindio.proyectoFinal.model.EstadoProducto;
import co.edu.uniquindio.proyectoFinal.model.Producto;
import co.edu.uniquindio.proyectoFinal.model.Publicacion;

public class ProductoBuilder {

    protected String nombre;
    protected String imagen;
    protected String categoria;
    protected double precio;
    protected EstadoProducto estadoProducto;
    protected Publicacion publicacion;

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder imagen(String imagen) {
        this.imagen = imagen;
        return this;
    }

    public ProductoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder estadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
        return this;
    }

    public ProductoBuilder publicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public Producto build() {
        return new Producto(nombre, imagen, categoria, precio, estadoProducto, publicacion);
    }
}
