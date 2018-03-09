
package fecha;


import java.util.Scanner;

public class Principal1 {
     public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Dia:  ");
       Integer d= teclado.nextInt();
       System.out.println("Mes:  ");
       Integer m= teclado.nextInt();
       System.out.println("año:  ");
       Integer a= teclado.nextInt();
       System.out.println("Aumentar n dias:");
       Integer au= teclado.nextInt();
       Fecha f = new Fecha(d,m,a,au);
       f.setDia(d);
       f.setMes(m);
       f.setAnio(a);
       f.Aumentar();
       f.Aumentar(au);
      
       
       System.out.println(f);   
    
}
}
