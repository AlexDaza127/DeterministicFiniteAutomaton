package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutomatFinite {

	List<String> input = new ArrayList<>();
	Scanner s = new Scanner(System.in);

	public void injectData() {
		System.out.println("Diseño de una AFD que acepte todas las cadenas binarias que al menos tengan un 0");
		int cant = 0;
		String inputChar = "";
		System.out.println("Digite el cadena a evaluar (presione solo 'a' para terminar )");
		while (inputChar.compareTo("a") != 0 && cant != 5) {
			inputChar = s.nextLine();
			if (inputChar.compareTo("a") != 0) {
				input.add(inputChar);
			}
			cant++;
		}

		process(input);
	}

	public void process(List<String> input) {
		boolean result = false;
		for (String getInput : input) {
			char[] data = getInput.toCharArray();

			for (Character simbol : data) {
				if (simbol.compareTo('0') == 0 || simbol.compareTo('1') == 0) {
					if (simbol.compareTo('0') == 0 && !result) {
						result = true;
					}
				}else {
					result = false;
					break;
				}
			}

			System.out.println("Input: " + getInput + "\t| Result:" + (result ? " accept" : " reject"));
			result = false;

		}
	}
}
