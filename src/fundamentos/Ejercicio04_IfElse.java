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
    
    private static final int LIMITE_INFERIOR = 0;
    private static final int LIMITE_SUPERIOR = 23;
    private static final int LIMITE_MADRUGADA = 5;
    private static final int LIMITE_MANIANA = 11;
    private static final int LIMITE_MEDIODIA = 13;
    private static final int LIMITE_TARDE = 19;        
    
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