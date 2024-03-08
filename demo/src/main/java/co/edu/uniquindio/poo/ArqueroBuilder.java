package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class ArqueroBuilder implements PersonajeBuilder {
    private String nombre;
    private List<Habilidad> habilidades;
    private long destreza;
    private long agilidad;
    private long precision;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public ArqueroBuilder(){
        this.habilidades = new ArrayList<Habilidad>();
    }


    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void habilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public void atributo1(long destreza) {
        this.destreza = destreza;
    }

    public void atributo2(long agilidad) {
        this.agilidad = agilidad;
    }

    public void atributo3(long precision) {
        this.precision = precision;
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
        if(habilidad == Habilidad.DISPARO_RAPIDO){
            habilidades.add(habilidad);
        }
        else if(habilidad == Habilidad.FLECHA_VENENOSA){
            habilidades.add(habilidad);
        } 
        else if(habilidad == Habilidad.TIRO_CERTERO){
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
        personaje.setAtributo1(destreza);
        personaje.setAtributo2(agilidad);
        personaje.setAtributo3(precision);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
        
    }
    
}

