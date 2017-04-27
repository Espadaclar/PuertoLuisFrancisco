public class Alquiler {
	private int diasOcupacion;
	private Barco barco;
	private int posicionAmarre;
	private static int  MULTIPLICADOR_ESLORA = 10;
	private static int  MULTIPLICADOR_BERNUA = 300;

	public Alquiler(int diasOcupacion, Barco barco, int posicionAmarre) {
		this.diasOcupacion = diasOcupacion;
		this.barco = barco;
		this.posicionAmarre = posicionAmarre;
	}
	
	public float getPrecioAlquiler() {
		float precioAlquiler;
		precioAlquiler = (diasOcupacion * MULTIPLICADOR_ESLORA * (float)barco.getEslora())
						+ (MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
		return precioAlquiler;
	}
	
	public int getNumeroAmarre(){
		return posicionAmarre;
	}
	
	public String toString() 
    {
        String valorADevolver = "";
        valorADevolver = barco + " " + numDiasAlquiler + " " + posicionAmarre;
        return valorADevolver;
    }
}
