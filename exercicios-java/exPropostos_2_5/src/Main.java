import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qntd;
		double valor, total;
		
		cod = sc.nextInt();
		qntd = sc.nextInt();
		
		if (cod == 1) {
			
			valor = 4 * qntd;
			System.out.println("VALOR: R$ " + valor);
			
		}else if(cod == 2) {
			
			valor = 4.5 * qntd;
			System.out.println("VALOR: R$ " + valor);
				
		}else if(cod == 3) {
			
			valor = 5 * qntd;
			System.out.println("VALOR: R$ " + valor);
				
		}else if(cod == 4) {
			
			valor = 2 * qntd;
			System.out.println("VALOR: R$ " + valor);	
			
		}else if(cod == 5) {
			
			valor = 1.5 * qntd;
			System.out.println("VALOR: R$ " + valor);
			
		}

	}

}
