package horas.pkg2;

public class Horas2 {

    private Integer Minutos;
    private Integer Segundos;
    private Integer Horas;

    public Horas2(Integer Minutos, Integer Segundos, Integer Horas) {
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Horas = Horas;
    }

    

    public String toString() {
        return Horas + ":" + Minutos + ":" + Segundos;
    }

    public Integer getMinutos() {
        return Minutos;
    }

    public void setMinutos(Integer Minutos) {
        this.Minutos = Minutos;
    }

    public Integer getSegundos() {
        return Segundos;
    }

    public void setSegundos(Integer Segundos) {
        this.Segundos = Segundos;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer Horas) {
        this.Horas = Horas;
    }

    public void aumentar() {
        this.Segundos++;
        if (this.Segundos>=60){
            this.Segundos=1;
            this.Minutos++;
            if (this.Minutos>=60){
                this.Minutos=1;
                Horas++;
            }
        }

    }
    public void aumentarN (Integer n){
        for(int i=0; i <n; i++){
            this.aumentar();
        }
    }

}
