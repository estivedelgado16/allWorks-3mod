/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismos;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author brall
 */
public class Centro {
    private List<Animal>animalesDisponibles;
            
  public Centro(){
   animalesDisponibles = new ArrayList<>();
  }
  public void agregando (Animal animal){
      System.out.println("holaa");
  animalesDisponibles.add(animal);
  }
        
  public void listaAnimal(){
      System.out.println("Animales Disponibles");
      for(Animal animal : animalesDisponibles){
      System.out.println("nombre"+ animal.getNombre()+" nombre"+ animal.getNombre());
      if(animal instanceof Perro){
      System.out.println("La raza es"+((Perro) animal).getRaza());
      }else if(animal instanceof Gato){
          System.out.println("es un gato");
      }
      }
      
  }
  
}
