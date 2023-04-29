public class EquivalenteTiempo {
    public static void main(String[] args) {
        EquivalenteHora eh = new EquivalenteHora(45);
        eh.calcularMinutos();
        eh.calcularSegundos();
        eh.calcularDias();
        System.out.println(eh);
    }
}

class EquivalenteHora{
    private int horas;
    private int minutos;
    private int segundos;
    private float dias;

    public EquivalenteHora(int horas){
        this.horas=horas;
    }

    public void calcularDias(){
        this.dias = (float) (this.horas / 24.0);
    }

    public void calcularMinutos (){
        this.minutos = this.horas * 60;
    }

    public void calcularSegundos () {
        this.segundos = this.horas * 3600;
    }

    public void setHoras (int horas){
        this.horas = horas;
    }

    public void setMinutos (int minutos){
        this.minutos = minutos;
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    public void setDias (float dias){
        this.dias =dias;
    }

    public float getDias (){
        return this.dias;
    }

    public int getHoras (){
        return this.horas;
    }

    public int getMinutos () {
        return this.minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String toString (){
        String msj = String.format("Conversor: " + "\nDias: %.2f" + "\nHoras: %d" + "\nMinutos: %d" + "\nSegundos: %d",

                getDias(), getHoras(), getMinutos(), getSegundos());
    return msj;
    }
}
