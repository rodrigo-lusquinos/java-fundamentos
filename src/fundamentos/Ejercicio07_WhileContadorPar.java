/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author lusqu
 */
public class Ejercicio07_WhileContadorPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresá un número positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0) {
            
            if (num % 2 != 0) {
                num--; // es lo mismo que num = num - 1;
            }
            
            int cont = num;
            
            while (cont >= 0) {                
                System.out.print(cont + " ");
                cont -= 2; //es lo mismo que usar cont = cont - 2;
            }
            
            /* Así sería si utilizara for para reemplazar el while
            for (int cont = num; cont >= 0; cont -= 2) {
                System.out.print(cont + " ");
            }*/
            System.out.println();
        } else {
            System.out.println("El número debía ser positivo");
        }
    }
}
