/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author lusquiños
 * 
 * Se realizaron modificaciones con respecto al ejercicio 6 para que se muestren los números con decimales o sin decimales según corresponda
 */
public class Ejercicio06bis_SwitchCalculadoraDecimales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado = 0;
        char simbolo;
        boolean operacionValida = true;
        
        System.out.println("Ingresa número 1: ");
        num1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresa número 2: ");
        num2 = Double.parseDouble(input.nextLine());
        
        System.out.println("[+] a + b sumar");
        System.out.println("[-] a - b restar");
        System.out.println("[x] a x b multiplicar" );
        System.out.println("[/] a / b dividir");
        System.out.println("Ingresa un símbolo: ");
        simbolo = input.nextLine().charAt(0);

        switch (simbolo) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case 'x':
            case 'X':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;    
                } else {
                    System.out.println("No se puede dividir por 0");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación inválida");
                operacionValida = false;
        }
        //Genero un if para mostrar si el resultado es entero, como entero y si el resultado tiene decimales, mostrarlo con decimales
        if (operacionValida) {
            //El resultado % 1 == 0 valida si el número tiene 0 decimales, entonces se mostrará el resultado castineado como integro
            if (resultado % 1 == 0) {
            System.out.println("Resultado: " + (int) resultado);
            } else {
            System.out.println("Resultado: " + resultado);
            }
        }
    }    
}
