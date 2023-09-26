/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismos;

/**
 *
 * @author brall
 */
public class Perro extends Animal {
    String raza;

    public Perro() {
    }    

    public Perro(String raza, String nombre, String color, String tipo, int id) {
        super(nombre, color, tipo, id);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String sonido() {
       return "weao";
    }

  
    
    
    
}
