
package reloj;

import java.util.Scanner;


public class Principal {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Fecha: (Dia:  Mes:  Anio:  )");
        System.out.println("Dia:  ");
        Integer Dia= teclado.nextInt();
        System.out.println("Mes:  ");
        Integer Mes = teclado.nextInt();
        System.out.println("Anio;  ");
        Integer Anio = teclado.nextInt();
        System.out.println("Hora: (Hora(s):  Minuto(s):  Segundos(s)");
        System.out.println("Hora(s):  ");
        Integer Hora = teclado.nextInt ();
        System.out.println("Minuto(s):  ");
        Integer Minuto = teclado.nextInt();
        System.out.println("Segundo(s):  ");
        Integer Segundo= teclado.nextInt();
        Reloj R= new Reloj(Segundo,Minuto,Hora,Dia,Mes,Anio);
        R.setSegundo(Segundo);
        R.setMinuto(Minuto);
        R.setHora(Hora);
        R.setDia(Dia);
        R.setMes(Mes);
        R.setAnio(Anio);
        while (true){
        R.Aumentar();
        System.out.println(R);    
        }
    }
        
    }
    

