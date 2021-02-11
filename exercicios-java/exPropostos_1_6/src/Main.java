import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriangulo = (a*c)/2;
		areaCirculo = 3.14159*Math.pow(c, 2);
		areaTrapezio = ((a+b)*c)/2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a*b;
		
		System.out.println("TRIANGULO = " + areaTriangulo);
		System.out.println("CIRCULO = " + areaCirculo);
		System.out.println("TRAPEZIO = " + areaTrapezio);
		System.out.println("QUADRADO = " + areaQuadrado);
		System.out.println("RETANGULO = " + areaRetangulo);

	}

}
