import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >= 1  && y >= 1) {
			
			System.out.println("QUADRANTE 1\n");
			
		}else if(x <= -1  && y >= 1) {
			
			System.out.println("QUADRANTE 2\n");
			
		}else if(x <= -1  && y <= -1) {
			
			System.out.println("QUADRANTE 3\n");
			
		}else if(x >= 1  && y <= -1) {
			
			System.out.println("QUADRANTE 4\n");
			
		}
		
		while(x != 0 || y != 0) {

			x = sc.nextInt();
			y = sc.nextInt();
			
			
			if(x >= 1  && y >= 1) {
				
				System.out.println("QUADRANTE 1\n");
				
			}else if(x <= -1  && y >= 1) {
				
				System.out.println("QUADRANTE 2\n");
				
			}else if(x <= -1  && y <= -1) {
				
				System.out.println("QUADRANTE 3\n");
				
			}else if(x >= 1  && y <= -1) {
				
				System.out.println("QUADRANTE 4\n");
				
			}
			
		}

	}

}
