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
public class Ejercicio05_IfElse2 {

    private static final double LIMITE_1 = 10000;
    private static final double LIMITE_2 = 20000;
    private static final double LIMITE_3 = 30000;
    private static final double DESCUENTO_MINIMO = 0.5;
    private static final double DESCUENTO_BAJO = 1.0;
    private static final double DESCUENTO_MEDIO = 2.0;
    private static final double DESCUENTO_SUPERIOR = 2.5;
    private static final double INCREMENTO_MENOR_30 = 20.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edadEmpleado;
        double sueldoAnual, aporte, porcentaje;

        System.out.print("Ingrese la edad ");
        edadEmpleado = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese su sueldo anual ");
        sueldoAnual = Double.parseDouble(input.nextLine());

        if (edadEmpleado > 0 && sueldoAnual > 0) {
            if (sueldoAnual < LIMITE_1) {
                porcentaje = DESCUENTO_MINIMO;
            } else if (sueldoAnual <= LIMITE_2) {
                porcentaje = DESCUENTO_BAJO;
            } else if (sueldoAnual <= LIMITE_3) {
                porcentaje = DESCUENTO_MEDIO;
            } else {
                porcentaje = DESCUENTO_SUPERIOR;
            }
            aporte = sueldoAnual * (porcentaje / 100);

            if (edadEmpleado <= 30) {
                aporte = aporte + aporte * (INCREMENTO_MENOR_30 / 100);
            }
            System.out.println("El aporte es de " + aporte);
        } else {
            System.out.println("Datos erroneos...");
        }
    }
}
