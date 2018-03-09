package reloj2;
public class Reloj2 {
    private Fecha fecha;
    private Hora hora;
    private Integer aumentar;

    public Reloj2(Fecha fecha, Hora hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public Reloj2(int segundo, int minuto, int hora, int dia, int mes, int anio){
        this.fecha= new Fecha(dia, mes, anio);
        this.hora= new Hora(segundo, minuto, segundo);
        }
    public String toString(){
        return fecha+"   "+hora;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Integer getAumentar() {
        return aumentar;
    }

    public void setAumentar(Integer aumentar) {
        this.aumentar = aumentar;
    }
    public void aumentar1(){
        this.hora.aumentar();
        if ((this.hora.getHora()==0)&&(this.hora.getMinuto()==0)&&(this.hora.getSegundo()==0)){
            this.fecha.aumentar();
        }
        
    
    }
    
    
}



