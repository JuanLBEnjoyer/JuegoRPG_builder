package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Jugador {

     List<PersonajeBuilder> personajes;
     PersonajeDirector director;

     public Jugador(){
        this.personajes = new ArrayList<PersonajeBuilder>();
     }

     public Optional<PersonajeBuilder> buscarNombre(PersonajeBuilder personaje){
      Predicate<PersonajeBuilder> condicion = p -> p.getNombre().equals(personaje.getNombre());
      return personajes.stream().filter(condicion).findAny();
     }

     public void validarNombre(PersonajeBuilder personaje){

      boolean nombreRepetido = buscarNombre(personaje).isPresent();
      assert !nombreRepetido: "Nombre repetido";

     }



     public void adicionarArquero(String nombre,List<Habilidad> habilidades,long destreza, long agilidad,
     long precision,  String descripcion, String apodo, double dineroInicial ){
        MagoBuilder builder = new MagoBuilder();
        director = new PersonajeDirector(builder);
        director.construir(nombre, habilidades, destreza, agilidad, precision
        , descripcion, apodo, dineroInicial);
        validarNombre((PersonajeBuilder) builder.build());
        personajes.add((PersonajeBuilder) builder.build());


     }

     public void adicionarGuerrero(String nombre,List<Habilidad> habilidades,long fuerza, long resistencia,
     long habilidad,  String descripcion, String apodo, double dineroInicial ){
        MagoBuilder builder = new MagoBuilder();
        director = new PersonajeDirector(builder);
        director.construir(nombre, habilidades, fuerza, resistencia, habilidad
        , descripcion, apodo, dineroInicial);
        validarNombre((PersonajeBuilder) builder.build());
        personajes.add((PersonajeBuilder) builder.build());


     }

     public void adicionarMago(String nombre,List<Habilidad> habilidades,long inteligencia, long agilidad ,
     long precision,  String descripcion, String apodo, double dineroInicial ){
        MagoBuilder builder = new MagoBuilder();
        director = new PersonajeDirector(builder);
        director.construir(nombre, habilidades, inteligencia, agilidad, precision
        , descripcion, apodo, dineroInicial);
        validarNombre((PersonajeBuilder) builder.build());
        personajes.add((PersonajeBuilder) builder.build());


     }
    
}
