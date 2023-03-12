package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que aplica los pasos para obtener el resultado de una automata finito
 * depeterministico AFD
 * 
 * @author Michael
 */
public class AutomatFiniteD {
	
	/**
	 * Este método toma los datos que se ingresan como input del AFD
	 */
	public void injectData() {
		List<String> input = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		System.out.println("Diseño de una AFD que acepte todas las cadenas binarias que al menos tengan un 0");

		String inputChar = "";
		System.out.println("Digite el cadena a evaluar (presione solo '-' para terminar )");
		while (inputChar.compareTo("-") != 0) {
			inputChar = s.nextLine();// se toma el dato que se almacenara en el input del AFD, esto hasta que se haya digitado un guion (-)
			if (inputChar.compareTo("-") != 0) {//si no es un guion que siga almacenando data en el almacenamiento del input
				input.add(inputChar);
			}
		}

		process(input);
		s.close();
	}

	/**
	 * Método que realiza el procedimiento para encontrar el resultado de la
	 * evaluación del AFD
	 * 
	 * @param input datos almacenados para el input del AFD
	 */
	public void process(List<String> input) {
		boolean result = false;
		System.out.println("\n Resultados:\n");
		for (String getInput : input) {//se itera sobre cada dato de input almacenado
			char[] data = getInput.toCharArray();//se divide por caracter cada dato del input que este en la iteración

			for (Character simbol : data) {
				if (simbol.compareTo('0') == 0 || simbol.compareTo('1') == 0) {// se comprueba que es un binario
					if (simbol.compareTo('0') == 0 && !result) {// se valida si al menos hay un cero en el binario
						result = true;
					}
				} else {
					result = false;
					break;
				}
			}

			// Por cada input que se haya ingresado y despues de la evaluación de
			// condiciones muestra el resultado del proceso
			System.out.println("Input: " + getInput + "\t| Result:" + (result ? " accept" : " reject"));
			result = false;

		}
	}
}
