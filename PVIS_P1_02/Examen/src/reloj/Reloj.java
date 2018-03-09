
package reloj;

public class Reloj {
    private Integer Segundo;
    private Integer Minuto;
    private Integer Hora;
    private Integer Dia;
    private Integer Mes;
    private Integer Anio;
    private Integer Aumentar;
    

  
    public Reloj (Integer Segundo,Integer Minuto, Integer Hora, Integer Dia, Integer Mes, Integer Anio){
        this.Segundo=Segundo;
        this.Minuto=Minuto;
        this.Hora=Minuto;
        this.Dia=Dia;
        this.Mes=Mes;
        this.Anio=Anio;
    }
    public String toString(){
        return Hora+ ":" +Minuto+ ":" + Segundo +" "+Dia+"/"+Mes+"/"+Anio;
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

    public Integer getSegundo() {
        return Segundo;
    }

    public void setSegundo(Integer Segundo) {
        this.Segundo = Segundo;
    }

    public Integer getMinuto() {
        return Minuto;
    }

    public void setMinuto(Integer Minuto) {
        this.Minuto = Minuto;
    }

    public Integer getHora() {
        return Hora;
    }

    public void setHora(Integer Hora) {
        this.Hora = Hora;
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
        return Aumentar;
    }

    public void setAumentar(Integer Aumentar) {
        this.Aumentar = Aumentar;
    }
    public void Aumentar(){
        this.Segundo++;
        if (this.Segundo>=60){
            this.Segundo=1;
            this.Minuto++;
            if (this.Minuto>=60){
                this.Minuto=1;
                this.Hora++;
                if(this.Hora>=24){
                    this.Hora=0;
                    this.Dia++;
                    if(this.Dia> this.diasMes()){
                        this.Dia=1;
                        this.Mes++;
                        if (this.Mes>12){
                            this.Anio++;
                        }
                    }
                }
            }
        }
        
        
    }

    
}
