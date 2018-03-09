
package monomio;


public class Principal {
    
    public static void main (String []args){
        Polinomio p = new Polinomio();
        Monomio mono= new Monomio(4,6);
        Monomio mono2= new Monomio(-8,6);
        Monomio mono3= new Monomio(8,7);
        Monomio mono4= new Monomio(9,6);
        Monomio mono5= new Monomio(8,7);
        p.agregar(mono );
        p.agregar(mono2);
        p.agregar(mono3);
        p.agregar(mono4);
        p.agregar(mono5);
      
        
        System.out.println(p);
        
        
        
    }
    
}
