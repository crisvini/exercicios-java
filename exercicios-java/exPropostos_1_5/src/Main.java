import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, quantidade1, quantidade2;
		double valor1, valor2, total;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (valor1*quantidade1)+(valor2*quantidade2);
		
		System.out.println("TOTAL = " + total);

	}

}
