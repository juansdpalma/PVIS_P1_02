
package Punto;

import java.util.Scanner;

public class principal {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame tu coordenada x1:  ");
        Integer xx1= teclado.nextInt();
        System.out.println("Dame tu coordenada y1:  ");
        Integer yy1= teclado.nextInt();
        System.out.println("Dame tu coordenada x2:  ");
        Integer xx2= teclado.nextInt();
        System.out.println("Dame tu coordenada y2");
        Integer yy2= teclado.nextInt();
        
        Punto p1 = new Punto(xx1,yy1);
        Punto p2 = new Punto(xx2,yy2);
        Linea linea = new Linea (p1,p2);
        System.out.println(linea.Distancia());
            
        
        
        
        
    }
    
    
}
