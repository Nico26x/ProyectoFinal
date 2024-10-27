package co.edu.uniquindio.proyectoFinal.model;

public class Chat {

    private Mensaje mensaje;

    public Chat(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
}
