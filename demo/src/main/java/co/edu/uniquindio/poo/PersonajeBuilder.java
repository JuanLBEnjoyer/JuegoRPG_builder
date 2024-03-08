package co.edu.uniquindio.poo;

import java.util.List;

public interface PersonajeBuilder {
    void nombre(String nombre);

    void habilidades(List<Habilidad> habilidad);

    void atributo1(long atributo1);

    void atributo2(long atributo2);

    void atributo3(long atributo3);

    void descripcion(String descripcion);

    void apodo (String apodo);

    void dineroInicial(double dineroInicial);

    void agregarHabilidad(Habilidad habilidad);

    public String getNombre();
    
    Personaje build();
    
}
