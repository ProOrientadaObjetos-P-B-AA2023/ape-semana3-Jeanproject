public class problema4 {
    public static void main(String[] args) {
        EquipoCelular celular= new EquipoCelular("iOS",5.5,1200,20,"789pvm145","123asdaw563");
        celular.calcularivaCostoFinal();
        System.out.println(celular);
    }
}
class EquipoCelular{

    private String sistemaOpe;

    private double tamanioPant;

    private double costoIni;

    private double ivaPor;

    private double ivaCostoFinal;

    private String direccionMac;

    private String infoIMEI;


    public EquipoCelular(String sistemaOpe, double tamanioPant, double costoIni,double ivaPor,String direccionMac, String infoIMEI){
        this.sistemaOpe=sistemaOpe;

        this.tamanioPant=tamanioPant;

        this.costoIni=costoIni;

        this.ivaPor=ivaPor;

        this.direccionMac=direccionMac;

        this.infoIMEI=infoIMEI;
    }

    public void calcularivaCostoFinal(){this.ivaCostoFinal=(this.costoIni*(this.ivaPor/100))+this.costoIni;}
    public void setSistemaOpe(String sistemaOpe){
        this.sistemaOpe=sistemaOpe;
    }

    public void setTamanioPant(double tamanioPant){
        this.tamanioPant=tamanioPant;
    }

    public void setCostoIni(double costoIni){
        this.costoIni=costoIni;
    }

    public void setIvaPor(double ivaPor){
        this.ivaPor=ivaPor;
    }

    public void setIvaCostoFinal(double costoFinal){
        this.ivaCostoFinal=ivaCostoFinal;
    }

    public void setDireccionMac(String direccionMac){
        this.direccionMac=direccionMac;
    }

    public void setInfoIMEI(String infoIMEI){
        this.infoIMEI=infoIMEI;
    }

    public String getSistemaOpe(){
        return this.sistemaOpe;
    }

    public double getTamanioPant(){
        return this.tamanioPant;
    }

    public double getCostoIni(){
        return this.costoIni;
    }

    public double getIvaPor(){
        return this.ivaPor;
    }

    public double getIvaCostoFinal(){
        return this.ivaCostoFinal;
    }

    public String getDireccionMac(){
        return this.direccionMac;
    }

    public String getInfoIMEI(){
        return this.infoIMEI;
    }
    public String toString(){
        String msj= String.format("DISPOSITIVOS ELECTRONICOS"+ "\nSistema Operativo: %s"+ "\nTamanio Pantalla: %.2f"+ "\nCosto Inicial: %.2f"+ "\nIva en Porcentaje:%.2f" + "\nIva Costo Final: %.2f" + "\nDireccion MAC: %s" +
                        "\nInfo IMEI: %s",
                this.getSistemaOpe(),this.getTamanioPant(),this.costoIni, this.ivaPor, this.ivaCostoFinal,
                this.direccionMac, this.getInfoIMEI());

        return msj;
    }
}

