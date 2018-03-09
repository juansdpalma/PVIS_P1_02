
package reloj;

public class Hora {
    private Integer Minuto;
    private Integer Segundo;
    private Integer Hora;
    private Integer aumentar;
    public Hora(Integer Segundo,Integer Minuto, Integer Hora){
        this.Hora= Hora;
        this.Minuto= Minuto;
        this.Segundo= Segundo;
              
    }

    public Integer getMinuto() {
        return Minuto;
    }

    public void setMinuto(Integer Minuto) {
        this.Minuto = Minuto;
    }

    public Integer getSegundo() {
        return Segundo;
    }

    public void setSegundo(Integer Segundo) {
        this.Segundo = Segundo;
    }

    public Integer getHora() {
        return Hora;
    }

    public void setHora(Integer Hora) {
        this.Hora = Hora;
    }

    public Integer getAumentar() {
        return aumentar;
    }

    public void setAumentar(Integer aumentar) {
        this.aumentar = aumentar;
    }
    public void aumentar(){
        this.Segundo++;
        if(this.Segundo>=Minuto){
            this.Segundo=1;
            this.Minuto++;
            if (this.Minuto >=60){
                this.Minuto=1;
                this.Hora++;
                if (this.Hora >= 24){
                    this.Hora=0;
                    
                }
            }
        }
        
    }
}
