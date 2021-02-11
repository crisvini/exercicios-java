import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if(salario >= 0 && salario <= 2000) {
			
			imposto = 0;
			System.out.printf("IMPOSTO DE RENDA: R$ %.2f%n", imposto);
			
		}else if(salario >= 2000.01 && salario <= 3000) {
			
			imposto = salario * 0.08;
			System.out.printf("IMPOSTO DE RENDA: R$ %.2f%n", imposto);
			
		}else if(salario >= 3000.01 && salario <= 4500) {
			
			imposto = salario * 0.18;
			System.out.printf("IMPOSTO DE RENDA: R$ %.2f%n", imposto);
			
		}else if(salario >4500.01) {
			
			imposto = salario * 0.28;
			System.out.printf("IMPOSTO DE RENDA: R$ %.2f%n", imposto);
			
		}

	}

}
