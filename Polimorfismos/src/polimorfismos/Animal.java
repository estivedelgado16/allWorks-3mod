/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismos;

/**
 *
 * @author brall
 */
 abstract public class Animal {
    private String nombre, color, tipo;
    int id;

    public Animal() {
    }
    

    public Animal(String nombre, String color, String tipo,int id) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.id = id;
    }

    abstract public String sonido();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
}
