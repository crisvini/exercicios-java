package entities;

public class CurrencyConverter {

	public static double dolar, qntd, total;
	
	public static void calcula() {
		
		total = (dolar * qntd);
		
	}
	
	public String toString() {
		
		return "Valor a ser pago em reais: "
			+ String.format("%.2f", total);
	
	}
	
}
