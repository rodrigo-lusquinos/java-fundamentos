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
public class Ejercicio08_ForTablaMultiplicadora {
    private static final int MIN = 1;
    private static final int MAX = 10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingresá un número positivo: ");
        num = Integer.parseInt(input.nextLine());
        if (num >= MIN && num <= MAX) {
            for (int cont = MIN; cont <= MAX; cont++) {
                System.out.println(num + " x " + cont + " = " + (num * cont));
            }
        } else {
            System.out.println("La operación es inválida");
        }
    }
}
