package monomio;
import java.util.ArrayList;
public class Polinomio {
    private ArrayList<Monomio>elementos;
    public Polinomio(){
        elementos = new ArrayList<Monomio>();
    }
    public void agregar (Monomio m){
        this.elementos.add(m);
    }
    public String toString(){
        String acumulador=" ";
        for (int i=0; i <this.elementos.size();i++){
        Monomio m = this.elementos.get(i);
        acumulador= acumulador+m.toString();
        }
        return acumulador;
      }     
    public ArrayList Simplificar(){
        ArrayList<Monomio> tem= new ArrayList<>();
        while (this.elementos.size()!=0){
            Monomio actual= this.elementos.remove(0);
            int i=0;
            while(i<this.elementos.size()){
                Monomio comparar = this.elementos.get(i);
                if (actual.getExponente().compareTo(comparar.getExponente())==0){
                    actual.setCoeficiente(actual.getCoeficiente()+comparar.getCoeficiente());
                    this.elementos.remove(i);
                }
                else{
                    i++;
                }
                tem.add(actual);
            }
            elementos=tem;
        }
        return elementos ;
        
        } 

    }
            
     
    