/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author laboratorio
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***Escoja un opcion para calcular el Area de:***: \n 1.Cuadrado \n 2.Rectangulo \n 3.Triangulo \n 4.Circulo \n Escoja su opcion:");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
                System.out.println("El area del cuadrado es:"+ Math.pow(lado, 2) );
            break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce un base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce un altura"));
                System.out.println("El area del rectangulo es:"+ base*altura );
            break;
            case 3:
                int base1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un base"));
                int altura2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un altura"));
                System.out.println("El area del Triangulo es:"+ (base1*altura2)/2 );
            break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce un radio"));
                System.out.println("El area del Circulo es:");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
            break; 
            default:
                System.out.println("La opcion no es correcta");
        }
        
    }
    
}
