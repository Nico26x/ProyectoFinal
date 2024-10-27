package co.edu.uniquindio.proyectoFinal.model;

public class Publicacion {

    private Comentario comentario;

    public Publicacion(Comentario comentario) {
        this.comentario = comentario;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }
}
