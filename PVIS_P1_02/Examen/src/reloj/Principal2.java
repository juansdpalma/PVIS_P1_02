
package reloj;

import java.util.Scanner;

public class Principal2 {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Fecha:  ");
        System.out.println("Dia:  ");
        Integer Dia = teclado.nextInt();
        System.out.println("Mes:  ");
        Integer Mes = teclado.nextInt();
        System.out.println("Anio:  ");
        Integer Anio = teclado.nextInt();
        System.out.println("Hora:  ");
        System.out.println("Hora(s):  ");
        Integer Hora = teclado.nextInt();
        System.out.println("Minuto(s):  ");
        Integer Minuto = teclado.nextInt();
        System.out.println("Segundo(s):  ");
        Integer Segundo = teclado.nextInt();
        
        Fecha f1 = new Fecha(Dia,Mes,Anio);
        f1.setDia(Dia);
        f1.setMes(Mes);
        f1.setAnio(Anio);
        Hora h1 = new Hora (Segundo,Minuto,Hora);
        h1.setHora(Hora);
        h1.setMinuto(Minuto);
        h1.setSegundo(Segundo);
        
        Reloj2 r1 = new Reloj2 (f1,h1);
        r1.setFecha(f1);
        r1.setHora(h1);
        r1.aumentar1();
        System.out.println(r1);
        
    }
    
}
