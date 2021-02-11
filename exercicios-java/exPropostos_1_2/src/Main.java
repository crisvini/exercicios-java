import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159, raio, area;
		
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("AREA = %.4f%n", area);

	}

}
