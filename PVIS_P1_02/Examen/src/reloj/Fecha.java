
package reloj;

public class Fecha {
    private Integer Dia;
    private Integer Mes;
    private Integer Anio;
    private Integer aumentar;

    
    
    public Fecha (Integer Dia, Integer Mes, Integer Anio){
        this.Anio= Anio;
        this.Dia= Dia;
        this.Mes=Mes;
        
    }

    public Integer getDia() {
        return Dia;
    }

    public void setDia(Integer Dia) {
        this.Dia = Dia;
    }

    public Integer getMes() {
        return Mes;
    }

    public void setMes(Integer Mes) {
        this.Mes = Mes;
    }

    public Integer getAnio() {
        return Anio;
    }

    public void setAnio(Integer Anio) {
        this.Anio = Anio;
    }
    public Integer getAumentar() {
        return aumentar;
    }

    public void setAumentar(Integer aumentar) {
        this.aumentar = aumentar;
    }
    private Integer diasMes(){
        
        switch(this.Mes){
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
                if(this.Anio %4==0){
                    return 29;
                }
                else{
                    return 28;
                }
            default: return 0;
        }        
    }
    public void aumentar (){
       this.Dia++;
        if ( this.Dia >=this.diasMes()){
            this.Dia=0;
            this.Mes++;
            if (this.Mes >=12){
                this.Anio++;
            }
        }
    }
    
    
    
}
