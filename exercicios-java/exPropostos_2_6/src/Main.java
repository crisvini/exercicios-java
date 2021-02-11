import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double valor;
		
		valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			
			System.out.println("INTERVALO: [0,25]");
			
		}else if(valor >= 26 && valor <= 50) {
			
			System.out.println("INTERVALO: [26,50]");
			
		}else if(valor >= 51 && valor <= 75) {
			
			System.out.println("INTERVALO: [51,75]");
			
		}else if(valor >= 76 && valor <= 100) {
			
			System.out.println("INTERVALO: [76,100]");
			
		}

	}

}
