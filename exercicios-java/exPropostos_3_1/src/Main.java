import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Insira uma senha: ");
		x = sc.nextInt();
		
		while(x != 2002) {
			
			System.out.println("Insira uma senha: ");
			x = sc.nextInt();
			
		}

		System.out.println("\nAcesso Permitido!");
			
	}

}
