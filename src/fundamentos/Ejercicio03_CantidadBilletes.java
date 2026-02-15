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
public class Ejercicio03_CantidadBilletes {
    
    private static final int CANT_100 = 100;
    private static final int CANT_50 = 50;
    private static final int CANT_20 = 20;
    private static final int CANT_10 = 10;
    private static final int CANT_5 = 5;
    private static final int CANT_2 = 2;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int monto, cant100, cant50, cant20, cant10, cant5, cant2;
        
        System.out.print("Ingrese un monto: ");
        monto = Integer.parseInt(input.nextLine());
        
        
        cant100 = monto / CANT_100;
        monto = monto % CANT_100; //representa al resto de la división
        cant50 = monto / CANT_50;
        monto = monto % CANT_50;
        cant20 = monto / CANT_20;
        monto = monto % CANT_20;
        cant10 = monto / CANT_10;
        monto = monto % CANT_10;
        cant5 = monto / CANT_5;
        monto = monto % CANT_5; 
        cant2 = monto / CANT_2;
        monto = monto % CANT_2;
        
        
        System.out.println("Cantidad de billetes de 100 = " + cant100);
        
        System.out.println("Cantidad de billetes de 50 = " + cant50);
        
        System.out.println("Cantidad de billetes de 20 = " + cant20);
        
        System.out.println("Cantidad de billetes de 10 = " +cant10);
        
        System.out.println("Cantidad de billetes de 5 = " + cant5);
        
        System.out.println("Cantidad de billetes de 2 = " + cant2);
        
        System.out.println("Cantidad de billetes de 1 = " + monto);
        
    }
}
