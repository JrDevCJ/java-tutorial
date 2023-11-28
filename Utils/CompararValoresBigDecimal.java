import java.math.BigDecimal;

public class CompararValoresBigDecimal {

	public static void main(String args[]) {

		// Valor1 igual Valor2
		BigDecimal valor1 = new BigDecimal("10.00");
		BigDecimal valor2 = new BigDecimal("10.00");
		int retornoCompareTo = valor1.compareTo(valor2);

		System.out.println("retornoCompareTo: " + retornoCompareTo);

		if (retornoCompareTo == 0) {
			System.out.println("Valor1 é igual Valor2");
		}

		// Valor1 maior que Valor2
		valor1 = new BigDecimal("20.00");
		valor2 = new BigDecimal("10.00");
		retornoCompareTo = valor1.compareTo(valor2);

		System.out.println("retornoCompareTo: " + retornoCompareTo);

		if (retornoCompareTo == 1) {
			System.out.println("Valor1 é maior que Valor2");
		}

		// Valor1 maior que Valor2
		valor1 = new BigDecimal("10.00");
		valor2 = new BigDecimal("20.00");
		retornoCompareTo = valor1.compareTo(valor2);

		System.out.println("retornoCompareTo: " + retornoCompareTo);

		if (retornoCompareTo == -1) {
			System.out.println("Valor1 é menor que Valor2");
		}

	}

}

