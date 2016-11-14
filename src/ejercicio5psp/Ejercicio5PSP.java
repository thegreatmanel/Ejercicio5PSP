/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5psp;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author Señor Manel
 */
public class Ejercicio5PSP {

    public static void main(String[] args) {
       Ordenes Fio1=new Ordenes("Numero 1");
       Ordenes Fio2=new Ordenes("Numero 2");
        
        Fio1.setPriority(MIN_PRIORITY);
        Fio2.setPriority(MAX_PRIORITY);
        Fio1.start();
        Fio2.start();
    }
    
}
