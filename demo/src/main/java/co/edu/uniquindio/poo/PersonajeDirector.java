package co.edu.uniquindio.poo;

import java.util.List;

public class PersonajeDirector {
    private PersonajeBuilder builder;

    public PersonajeDirector(PersonajeBuilder builder){
        this.builder = builder;
    }

    public Personaje construir(String nombre, List<Habilidad> habilidades, 
    long atributo1,long atributo2, long atributo3, String descripcion, String apodo, double dineroInicial){
        builder.nombre(nombre);
        builder.habilidades(habilidades);
        builder.atributo1(atributo1);
        builder.atributo2(atributo2);
        builder.atributo3(atributo3);
        builder.descripcion(descripcion);
        builder.apodo(apodo);
        builder.dineroInicial(dineroInicial);
        return builder.build();
    }

}
