import java.math.BigDecimal;

public class CompararValoresBigDecimal {

	public static void main(String args[]) {

		BigDecimal valor1 = new BigDecimal("10.00");
		BigDecimal valor2 = new BigDecimal("20.00");

		if(valor1.compareTo(valor2) < 0){
			System.out.print("Valor1 é menor Valor2");
		}



	}

}
