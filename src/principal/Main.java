package principal;

/**
 * 
 * Clase principal en donde se instancia el objeto que se va a utilizar como
 * ejemplo de un AFD
 * 
 * @author Michael
 *
 */
public class Main {

	public static void main(String[] args) {
		AutomatFiniteD automatFinite = new AutomatFiniteD();
		// Se llama al metodo que toma los datos para el input y pasa
		// luego al proceso construido para la logica del AFD
		automatFinite.injectData();
	}

}
