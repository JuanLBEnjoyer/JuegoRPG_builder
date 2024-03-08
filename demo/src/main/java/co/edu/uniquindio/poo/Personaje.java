package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Personaje {

    private String nombre;
    private Collection<Habilidad> habilidades;
    private long atributo1;
    private long atributo2;
    private long atributo3;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
    
    public Personaje(){
        this.habilidades = new ArrayList<Habilidad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Collection<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public long getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(long atributo1) {
        this.atributo1 = atributo1;
    }

    public long getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(long atributo2) {
        this.atributo2 = atributo2;
    }

    public long getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(long atributo3) {
        this.atributo3 = atributo3;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    
}
