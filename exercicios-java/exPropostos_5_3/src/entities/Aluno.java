package entities;

public class Aluno {

	public String nome;
	public double nota1, nota2, nota3, media;
	
	public double fazMedia() {
		
			return media = nota1 + nota2 + nota3;
		
	}	
	
	public String toString() {
		
			return "Media Final: "
				+ String.format("%.2f", media);
		
	}
	
}
