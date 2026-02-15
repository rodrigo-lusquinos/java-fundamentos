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
public class Ejercicio04_IfElse {
    
    final static int LIMITE_INFERIOR = 0;
    final static int LIMITE_SUPERIOR = 23;
    final static int LIMITE_MADRUGADA = 5;
    final static int LIMITE_MANIANA = 11;
    final static int LIMITE_MEDIODIA = 13;
    final static int LIMITE_TARDE = 19;        
    
    public static void main(String[] args) {        
        //System.setProperty("file.encoding", "UTF-8");
        Scanner input = new Scanner(System.in);
        
        int horaDelDia;
        
        System.out.println("Ingresa una hora del dia (entre " + LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR + ")");
        horaDelDia = Integer.parseInt(input.nextLine());
    
        if(horaDelDia < LIMITE_INFERIOR ){
            System.out.println("La hora del día no puede ser negativa");
        } else if (horaDelDia > LIMITE_SUPERIOR) {
            System.out.println("La hora del día no puede ser mayor a " + LIMITE_SUPERIOR);
        } else if (horaDelDia <= LIMITE_MADRUGADA ) {
            System.out.println("Es la MADRUGADA");
        } else if (horaDelDia <= LIMITE_MANIANA) {
            System.out.println("Es la MAÑANA");
        } else if (horaDelDia <= LIMITE_MEDIODIA) {
            System.out.println("Es el MEDIODIA");
        } else if (horaDelDia <= LIMITE_TARDE) {
            System.out.println("Es la TARDE");
        } else {
            System.out.println("Es la Noche");
        }
   
    }
        
 }
