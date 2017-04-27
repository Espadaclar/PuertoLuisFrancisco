public class Puerto {

	private Alquiler [] amarres;

	public Puerto() {
		amarres = new Alquiler[4];
	}

	public float alquilarAmarre(int diasOcupacion, Barco barco) {
		float precioAlquiler = -1;
		if (hayAmarresLibres()) {
			int posicionLibre = posicionPrimerAmarreLibre();
			Alquiler nuevoAlquiler = new Alquiler(diasOcupacion, barco, posicionLibre);
			amarres[posicionLibre] = nuevoAlquiler;
			precioAlquiler = nuevoAlquiler.getPrecioAlquiler();
		}
		return precioAlquiler;
	}

	public float liquidarAlquilerAmarre(int posicionAmarre) {
		float precioAlquiler = -1;
		if (!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] != null) {
			precioAlquiler = amarres[posicionAmarre].getPrecioAlquiler();
			amarres[posicionAmarre] = null;
		} 
		return precioAlquiler;
	}

	public void verEstadoAmarres() {
		for(int i = 0 ; i < amarres.length ; i++){
			if (amarres[i] == null){
				System.out.println("El amarre " + i + " se encuentra libre");
			} else {
				System.out.println("El amarre " + i + " esta ocupado");
			} 
		}
	}
	
	private int posicionPrimerAmarreLibre() {
		int primeraPoisicionLibre = -1;
		boolean buscando = true;
		int posicionAmarre = 0 ;
		while(posicionAmarre < amarres.length  && buscando){
			if (amarres[posicionAmarre] == null) {
				primeraPoisicionLibre = posicionAmarre;
				buscando = false;
			}
			posicionAmarre++;
		}
		return primeraPoisicionLibre;
	}

	private boolean hayAmarresLibres() {
		boolean hayAmarresLibres = false;
		int posicionAmarre = 0 ;
		while(posicionAmarre < amarres.length  && !hayAmarresLibres){
			if (amarres[posicionAmarre] == null) {
				hayAmarresLibres = true;
			}
			posicionAmarre++;
		}
		return hayAmarresLibres;
	}

}
