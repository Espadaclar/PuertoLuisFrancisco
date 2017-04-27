public abstract class  Barco {
    private Persona persona;
    private String matricula;
    private double eslora;
    private int anio;
    
    public Barco(String matricula, double eslora, int anio, Persona persona) {
        this.persona = persona;
        this.matricula = matricula;
        this.anio = anio;
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();

    @Override
    public String toString() {
        String datos = "";
        datos += "Nombre propietario: " +persona.getName()+ "\n";
        datos += "Matrícula del barco: " +matricula+ "\n";
        datos += "Metros de eslora: " +eslora+ " m.\n";
        datos += "Año de fabricación: " +anio;
        return datos;
        
        
    }
       
}