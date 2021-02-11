package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a cotação do dolar: ");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.println("Insira quantos dólares serão comprados: ");
		CurrencyConverter.qntd = sc.nextDouble();
		CurrencyConverter.calcula();
		System.out.printf("Valor a ser pago em reais: %.2f", CurrencyConverter.total);
		

	}

}
