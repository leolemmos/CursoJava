package aula05;

import java.util.Scanner;

public class Exercicio02 {
	//EXERCÍCIO 01- ESTRUTURA DE DECISÃO IF ELSE
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//DECLARANDO AS VARIÁVEIS
		double nota1, nota2, media;
				
		//IMPRESSÃO NA TELA
		System.out.println("Digite a primeira nota:");
		nota1 = teclado.nextDouble(); 
				
		System.out.println("Digite a segunda nota:");
		nota2 = teclado.nextDouble(); 
				
		//CALCULANDO A MÉDIA DAS NOTAS
		media = (nota1 + nota2)/2;
				
		//IMPRESSÃO NA TELA DO CONTEÚDO DA VARIÁVEL
		System.out.print("A nota média é  "+media);
			
		teclado.close(); //DESLIGANDO A ENTRADA DE DADOS
	}

}
