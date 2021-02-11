import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			
			System.out.println("ORIGEM");
			
		}else if(x >= 0  && y >= 0) {
			
			System.out.println("QUADRANTE 1");
			
		}else if(x <= 0  && y >= 0) {
			
			System.out.println("QUADRANTE 2");
			
		}else if(x <= 0  && y <= 0) {
			
			System.out.println("QUADRANTE 3");
			
		}else if(x >= 0  && y <= 0) {
			
			System.out.println("QUADRANTE 4");
			
		}

	}

}
