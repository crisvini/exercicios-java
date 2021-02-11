package application;

import java.util.Scanner;

import entities.Aluno;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Aluno aluno = new Aluno();		
		
		System.out.println("Insira um nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Insira a nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Insira a nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Insira a nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.fazMedia();
		
		if(aluno.media < 60) {
			
			System.out.println(aluno);
			System.out.println("Não Aprovado");
			double falta = 60 - aluno.media;
			System.out.printf("Faltam %.2f pontos", falta);
			
		}else {
			
			System.out.println(aluno);
			System.out.println("Aprovado");
			
		}

	}

}
