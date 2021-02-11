import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, hora, valor, salario;
		
		number = sc.nextInt();
		hora = sc.nextInt();
		valor = sc.nextInt();
		salario = hora*valor;
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = " + salario);

	}

}
