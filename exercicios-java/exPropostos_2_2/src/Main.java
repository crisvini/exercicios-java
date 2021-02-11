import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, resto;
		
		numero = sc.nextInt();
		resto = numero % 2;
		
		if(resto==0) {
			
			System.out.println("PAR");
			
		}else {
			
			System.out.println("IMPAR");
			
		}

	}

}
