/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Lusquiños
 */

public class Ejercicio01_EdadUsuario {
    
    final static int ANIO_ACTUAL = 2026;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anioDeNacimiento, edadDelUsuario;
        
        System.out.print("Ingrese año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        edadDelUsuario = ANIO_ACTUAL - anioDeNacimiento;
        
        System.out.println("Su edad es " + edadDelUsuario + " ó " + (edadDelUsuario - 1) + " años");
    }
}