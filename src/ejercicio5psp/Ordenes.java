/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5psp;

/**
 *
 * @author Señor Manel
 */
public class Ordenes extends Thread{

public Ordenes(String nombre){
    super(nombre);
}    
@Override
public void run(){
   System.out.println("Soy el hilo "+getName());
} 
}