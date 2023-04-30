public class problema3 {
    public static void main(String[] args) {
        InstitucionEdu educativa= new InstitucionEdu("Calasanz","Fiscomisional", 3500,75,3,6000);
        educativa.calcularPresupuesto();
        System.out.print(educativa);
    }
}
class InstitucionEdu {
    private String nombre;
    private String tipoInst;
    private int numeroAlumn;
    private int numeroDoc;
    private int numeroSedes;
    private double gastosProyec;
    private double presupuesto;

    public InstitucionEdu (){ }
    public InstitucionEdu(String nombre, String tipoInst, int numeroAlumn, int numeroDoc, int numeroSedes, int gastosProyec) {
        this.nombre = nombre;
        this.tipoInst = tipoInst;
        this.numeroAlumn = numeroAlumn;
        this.numeroDoc = numeroDoc;
        this.numeroSedes = numeroSedes;
        this.gastosProyec= gastosProyec;
    }

    public void calcularPresupuesto(){
        this.presupuesto= numeroAlumn * gastosProyec;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTipoInstitucion(String tipoInst){
        this.tipoInst=tipoInst;
    }
    public void setNumeroAlumnos(int numeroAlumn){
        this.numeroAlumn=numeroAlumn;
    }
    public void setNumeroDocentes(int numeroDoc){
        this.numeroDoc=numeroDoc;
    }
    public void setNumeroSedes(int numeroSedes){
        this.numeroSedes=numeroSedes;
    }
    public void serPresup(double presupuesto){
        this.presupuesto=presupuesto;
    }
    public String getNombre() {
        return this.nombre;
    }

    public String getTipoInst() {
        return this.tipoInst;
    }

    public int getNumeroAlumn() {
        return this.numeroAlumn;
    }

    public int getNumeroDoc() {
        return this.numeroDoc;
    }

    public int getNumeroSedes() {
        return this.numeroSedes;
    }

    public double getGastosProyec() {
        return this.gastosProyec;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    @Override
    public String toString() {
        String msj = String.format("INSTITUCIONES EDUCATIVAS" +
                        "\nNombre: %s" +
                        "\nTipo: %s" +
                        "\nNumero Alumnos: %d" +
                        "\nNumero Docentes: %d" +
                        "\nNumero Sedes: %d" +
                        "\nGastos Proyectados: %.2f" +
                        "\nPresupuesto: %.2f", this.getNombre(), this.getTipoInst(), this.getNumeroAlumn(), this.getNumeroDoc(), this.getNumeroSedes(),
                this.getGastosProyec(), this.getPresupuesto());
        return msj;
    }
}

