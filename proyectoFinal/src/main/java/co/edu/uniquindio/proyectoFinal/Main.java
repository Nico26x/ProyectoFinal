package co.edu.uniquindio.proyectoFinal;

import co.edu.uniquindio.proyectoFinal.model.Persona;
import co.edu.uniquindio.proyectoFinal.model.Vendedor;
import co.edu.uniquindio.proyectoFinal.model.builder.PersonaBuilder;
import co.edu.uniquindio.proyectoFinal.model.builder.VendedorBuilder;

public class Main {

    public static void main(String[] args) {

        Persona persona = new PersonaBuilder()
                .nombre("Nicolas")
                .build();

        System.out.println(persona);
    }
}
