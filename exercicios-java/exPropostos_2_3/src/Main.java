import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, resto;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			
			resto = a % b;
			if(resto==0) {
				
				System.out.println("MULTIPLOS");
				
			}else {
				
				System.out.println("NÃO MULTIPLOS");
				
			}
			
		}else {

			resto = b % a;
			if(resto==0) {
				
				System.out.println("MULTIPLOS");
				
			}else {
				
				System.out.println("NÃO MULTIPLOS");
				
			}
			
		}

	}

}
