import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, in = 0, out = 0;
		System.out.print("Insira quantos numeros serão inseridos: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("Insira um numero: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				
				in++;
				
			}else {
				
				out++;
				
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
