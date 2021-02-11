import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double a, b, divisao;
		
		System.out.print("Insira um numero: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			
			System.out.print("Insira o primeiro numero: ");
			a = sc.nextDouble();
			System.out.print("Insira o segundo numero: ");
			b = sc.nextDouble();
			
			if(b == 0) {
				
				System.out.print("Divisão Impossivel!\n");
				
			}else {
				
				divisao = a/b;
				System.out.printf("Resultado: %.2f%n", divisao);
				
			}
			
		}

	}

}
