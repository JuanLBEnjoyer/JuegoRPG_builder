package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class GuerreroBuilder implements PersonajeBuilder {
    private String nombre;
    private List<Habilidad> habilidades;
    private long fuerza;
    private long resistencia;
    private long vitalidad;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public GuerreroBuilder(){
        this.habilidades = new ArrayList<Habilidad>();
    }


    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void habilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public void atributo1(long fuerza) {
        this.fuerza = fuerza;
    }

    public void atributo2(long resistencia) {
        this.resistencia = resistencia;
    }

    public void atributo3(long vitalidad) {
        this.vitalidad = vitalidad;
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
        if(habilidad == Habilidad.ESPADA_AFILADA){
            habilidades.add(habilidad);
        }
        else if(habilidad == Habilidad.GOLPE_DEFINITIVO){
            habilidades.add(habilidad);
        } 
        else if(habilidad == Habilidad.ESCUDO_PROTECTOR){
            habilidades.add(habilidad);
        }
        else{
            System.out.println("Habilidad no valida");
        }
    }

    @Override
    
    public String getNombre(){
        return nombre;
    }



    public Personaje build(){ 
        Personaje personaje = new Personaje();
        personaje.setNombre(nombre);
        personaje.setHabilidades(habilidades);
        personaje.setAtributo1(fuerza);
        personaje.setAtributo2(resistencia);
        personaje.setAtributo3(vitalidad);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
        
    }
    
}