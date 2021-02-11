import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, f, total;
		
		i = sc.nextInt();
		f = sc.nextInt();
		
		if (i < f) {
			
			total = f - i;
			
		}else {
			
			total = 24 - i + f;
				
		}
		
		System.out.println("DURAÇÃO: " + total);

	}

}
