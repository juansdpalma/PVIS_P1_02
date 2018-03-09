
package horas.pkg2;

import java.util.Scanner;

public class Principal {
    public static void main (String []args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Horas:  ");
       Integer Horas= teclado.nextInt();
       System.out.println("Minutos:  ");
       Integer Minutos= teclado.nextInt();
       System.out.println("Segundos:  ");
       Integer Segundos= teclado.nextInt();
       System.out.println("Aumentar n segundos:");
       Integer au= teclado.nextInt();
       Horas2 h = new Horas2(Minutos, Segundos, Horas);
       h.setHoras(Horas);
       h.setMinutos(Minutos);
       h.setSegundos(Segundos);
       h.aumentarN(au);
       System.out.println(h);
       
       
    }
    
}
