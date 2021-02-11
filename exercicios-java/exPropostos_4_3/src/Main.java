import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0, a, b, c, i;
		
		System.out.print("Insira um numero de casos: ");
		n = sc.nextInt();

		for(i = 1; i <= n; i++) {
			
			System.out.print("\nInsira o primeiro numero: ");
			a = sc.nextInt();
			System.out.print("\nInsira o segundo numero: ");
			b = sc.nextInt();
			System.out.print("\nInsira o terceiro numero: ");
			c = sc.nextInt();
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("Media: %.2f%n", media);
			
		}	

	}

}
