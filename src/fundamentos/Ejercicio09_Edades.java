/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author lusquiños
 */
public class Ejercicio09_Edades {

    private static final int EDAD_MINIMA = 18;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantPersonas, edad, contMayoresDeEdad = 0;
        double porcMayoresDeEdad;

        System.out.println("Ingresá la cantidad de personas: ");
        cantPersonas = Integer.parseInt(input.nextLine());

        if (cantPersonas > 0) {

            for (int i = 1; i <= cantPersonas; i++) {
                System.out.println("Ingresa la edad de la persona n° " + i);
                edad = Integer.parseInt(input.nextLine());

                while (edad <= 0) {
                    System.out.println("Ingresar edad mayor a 0 años");
                    System.out.println("Ingresa la edad de la persona n° " + i);
                    edad = Integer.parseInt(input.nextLine());
                }

                if (edad >= EDAD_MINIMA) {
                    contMayoresDeEdad++;
                }
            }
            porcMayoresDeEdad = (contMayoresDeEdad * 100.0) / cantPersonas;
            System.out.println(porcMayoresDeEdad + "% de personas fueron mayores de " + EDAD_MINIMA);
        } else {
            System.out.println("La cantidad de personas debe ser mayor a 0");
        }
    }
}
