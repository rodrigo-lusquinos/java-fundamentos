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
public class Ejercicio06_SwitchCalculadora {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char simbolo;
        
        System.out.println("Ingresa número 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa número 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("[+] a + b sumar");
        System.out.println("[-] a - b restar");
        System.out.println("[x] a x b multiplicar" );
        System.out.println("[/] a / b dividir");
        System.out.println("Ingresa un símbolo: ");
        simbolo = input.nextLine().charAt(0);

        switch (simbolo) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 'x':
            case 'X':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + ((double)num1 / num2));    
                } else {
                    System.out.println("No se puede dividir por 0");
                }
                break;
            default:
                System.out.println("Operación inválida");;
        }
    }
}
