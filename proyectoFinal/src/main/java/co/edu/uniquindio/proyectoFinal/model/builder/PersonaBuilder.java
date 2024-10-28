package co.edu.uniquindio.proyectoFinal.model.builder;

import co.edu.uniquindio.proyectoFinal.model.Persona;
import co.edu.uniquindio.proyectoFinal.model.Usuario;

public class PersonaBuilder {

    protected String ;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String usuario;
    protected String contraseña;
    protected Usuario usuarioAsociado;

    public PersonaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonaBuilder apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public PersonaBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PersonaBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PersonaBuilder usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public PersonaBuilder contraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    public PersonaBuilder usuarioAsociado(Usuario usuarioAsociado) {
        this.usuarioAsociado = usuarioAsociado;
        return this;
    }

    public Persona build() {
        return new Persona(nombre, apellidos, cedula, direccion, contraseña, usuarioAsociado, usuario);
    }
}
