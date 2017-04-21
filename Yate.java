/**
 *franciscoJavier
 */
class Yate extends EmbarcacionAMotor {
    private int numCamarotes;

    public Yate(String matricula, double eslora, int anio, Persona persona, int potencia, int numCamarotes) {
        super(matricula, eslora, anio, persona, potencia);
        this.numCamarotes = numCamarotes;
    }
    

    @Override
    public int getCoeficienteBernua() {
       return numCamarotes + getPotencia();
    }
    
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Yate con " +numCamarotes+ " camarotes.\n";
        return datos;
    }
      
}