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
public class Ejercicio02_TerrenoAlambre {
    final static int CANT_PASADAS = 3;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int ancho,largo,superficie,perimetro,cantidadAlambre;
        double precioM2,valorTerreno;
        
        System.out.print("Ingrese el ancho del terreno ");
        ancho = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el largo del terreno ");
        largo = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el precio por m2 del terreno ");
        precioM2 = Double.parseDouble(input.nextLine());
     
        superficie = ancho * largo;
        valorTerreno = superficie * precioM2;
        perimetro = 2 * (ancho + largo);
        
        cantidadAlambre = perimetro * CANT_PASADAS;
        
        System.out.println("El valor del terreno es de " + valorTerreno + " USD");
        System.out.println("La cantidad de alambre necesario es de " + cantidadAlambre + " metros");
    }
}
