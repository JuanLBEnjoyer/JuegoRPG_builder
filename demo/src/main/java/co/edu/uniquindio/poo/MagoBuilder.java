package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class MagoBuilder implements PersonajeBuilder{
    private String nombre;
    private List<Habilidad> habilidades;
    private long inteligencia;
    private long agilidad;
    private long precision;
    private String descripcion;
    private String apodo;                           
    private double dineroInicial;

    public MagoBuilder(){
        this.habilidades = new ArrayList<Habilidad>();
    }


    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void habilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public void atributo1(long inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void atributo2(long agilidad) {
        this.agilidad = agilidad;
    }

    public void atributo3(long precision) {
        this.precision= precision;
    }


    public void descripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void apodo(String apodo) {
        this.apodo = apodo;
    }

    public void dineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public void agregarHabilidad(Habilidad habilidad){
        if(habilidad == Habilidad.BOLA_DE_FUEGO){
            habilidades.add(habilidad);
        }
        else if(habilidad == Habilidad.RAYO_ELECTRICO){
            habilidades.add(habilidad);
        } 
        else if(habilidad == Habilidad.HECHIZO_DE_CURACION){
            habilidades.add(habilidad);
        }
        else{
            System.out.println("Habilidad no valida");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public Personaje build(){ 
        Personaje personaje = new Personaje();
        personaje.setNombre(nombre);
        personaje.setHabilidades(habilidades);
        personaje.setAtributo1(inteligencia);
        personaje.setAtributo2(agilidad);
        personaje.setAtributo3(precision);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
        
    }
}
