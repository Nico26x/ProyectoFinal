package co.edu.uniquindio.proyectoFinal.model;

public class Usuario {

    private Persona personaAsociado;
    private String username;
    private String password;

    public Usuario(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public Persona getPersonaAsociado() {
        return personaAsociado;
    }

    public void setPersonaAsociado(Persona personaAsociado) {
        this.personaAsociado = personaAsociado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
