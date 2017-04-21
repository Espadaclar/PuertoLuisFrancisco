/**
 *franciscoJavier
 */
class Velero extends Barco {
    
    private int numMastiles;

    public Velero(String matricula,double eslora, int anio, Persona persona, int numMastiles) {
        super( matricula, eslora, anio, persona);
        this.numMastiles = numMastiles;
    }

    @Override
    public int getCoeficienteBernua() {
        return numMastiles;
    }
    
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Velero con " +numMastiles+ " mastiles.\n";
        return datos;
    }
    
}




