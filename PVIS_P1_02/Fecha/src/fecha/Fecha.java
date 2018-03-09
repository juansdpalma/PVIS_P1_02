
package fecha;


public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Integer aumentar;
    public Fecha(Integer dia, Integer mes, Integer anio, Integer aumentar){
        this.dia= dia;
        this.mes= mes;
        this.anio= anio;
        this.aumentar=aumentar;
    }
    public String toString(){
        return dia+ "/"+mes+"/"+anio;
    }
     private Integer diasMes(){
        
        switch(this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(this.anio %4==0){
                    return 29;
                }
                else{
                    return 28;
                }
            default: return 0;
        }
        
        
    }
    
    public void setDia (Integer d){
        dia= d;
    }
    public Integer getDia(){
        return dia;
    }
    public void setMes (Integer m){
        mes = m;
    }
    public Integer getMes(){
        return mes;
    }
    public void setAnio(Integer a){
        anio=a;
    }
    public Integer getAnio(){
        return anio;
    }
    public void setAumentar(Integer au){
        aumentar=au;
    }
    public Integer getAumentar(){
        return aumentar;
    }
   
    public void Aumentar(){
        this.dia++;
        if (this.dia > this.diasMes()){
            this.dia=1;
            this.mes++;
            if (this.mes > 12){
                this.mes=1;
                this.anio++;
            }
        }
    }
    public void Aumentar (Integer n){
        for(int i=0; i<n; i++){
            this.Aumentar();
        }
    }
    

    
    
    




    
}
