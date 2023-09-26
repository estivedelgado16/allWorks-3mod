/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismos;

/**
 *
 * @author brall
 */
public class Polimorfismos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("pitbull","zeus","cafe con negro","animal",1);
        Centro listanimales = new Centro();
        listanimales.agregando(perro1);
        Gato gato1 = new Gato("michi", "blanco", "gato", 2);
        listanimales.agregando(gato1);
        listanimales.listaAnimal();
    }
    
}
