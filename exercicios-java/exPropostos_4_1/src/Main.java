import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("Insira um valor: ");
		x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			
			int impar = i % 2;
			if(impar != 0) {
				
				System.out.println(i);
				
			}
			
		}

	}

}
