
package Punto;


public class Linea {
    private Punto inicio;
    private Punto fin;
    public Linea (Punto i,Punto f){
        this.inicio=i;
        this.fin=f;
    }
    public Linea(Integer x1, Integer x2, Integer y1, Integer y2){
        this.inicio=new Punto(x1,y1);
        this.fin=new Punto(x2,y2);
}
    public Double Distancia (){
        Integer x= fin.getx()-inicio.getx();
        Integer y= fin.gety()-inicio.gety();
        Double x2= Math.pow(x,2);
        Double y2= Math.pow(y,2);
        Double xy = x2+y2;
        return Math.sqrt(xy);
    }
}

