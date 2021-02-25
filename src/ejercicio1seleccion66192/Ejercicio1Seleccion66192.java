/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66192;
import java.util.Scanner;

/**
 *
 * @author acs
 */
public class Ejercicio1Seleccion66192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
    
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    
    System.out.println("Ingrese el primer número: ");
    num1 = datos.nextInt();
    
    System.out.println("Ingrese el segundo número: ");
    num2 = datos.nextInt();
   
    System.out.println("Ingrese el tercer número: ");
    num3 = datos.nextInt(); 
    
    
    if (num1>num2){
        if (num1>num3){
            System.out.println("El numero mayor es: " + num1);
        }
        else { 
            System.out.println("El numero mayor es: " + num2);
        }
       
    }
    else {
        if (num2>num3){
            System.out.println("El numero mayor es: " + num2);
        }
        else { 
            System.out.println("El numero mayor es: " + num3);
        }
    }
        
    }
}
 