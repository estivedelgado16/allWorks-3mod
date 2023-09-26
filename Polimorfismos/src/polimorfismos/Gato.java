/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismos;

/**
 *
 * @author brall
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String color, String tipo, int id) {
        super(nombre, color, tipo, id);
    }
    public String sonido(){
       return "woof";
    }
}
