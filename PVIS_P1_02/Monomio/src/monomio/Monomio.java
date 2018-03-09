
package monomio;


public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    public Monomio (Integer c, Integer e){
        this.coeficiente=c;
        this.exponente=e;      
    }
    public void setCoeficiente(Integer coeficiente){
        this.coeficiente=coeficiente;
    }
    public Integer getCoeficiente(){
        return coeficiente;
    }
    public void setExponente(Integer exponente){
        this.exponente=exponente;
    }
    public Integer getExponente(){
        return exponente;
   
    }
    public String toString(){
        if (coeficiente>0){
            return String.format("+%dx^%d",coeficiente,exponente);
            
        }
        else
            return String.format("%dx^%d",coeficiente,exponente);
    }
     
}
