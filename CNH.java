package aulas;
import java.util.Scanner;
public class CNH {
// EXERCICIO CNH
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int psico, legis, direcao; // criei as respectivas variaveis
		
		
		System.out.println("VOC� FOI APROVADO NO EXAME PSICOT�CNICO? DIGITE 1 SE SIM, OU 2 SE N�O"); // println para perguntar e o usuario digitar na linha de baixo
		psico = entrada.nextInt();
		
		System.out.println("VOC� FOI APROVADO NO EXAME DE LEGISLA��O? DIGITE 1 SE SIM, OU 2 SE N�O");  // println para perguntar e o usuario digitar na linha de baixo
		legis = entrada.nextInt();
		
		System.out.println("VOC� FOI APROVADO NO EXAME DE DIRE��O? DIGITE 1 SE SIM, OU 2 SE N�O"); // println para perguntar e o usuario digitar na linha de baixo
		direcao = entrada.nextInt();
		
		if ( psico == 1 && legis ==1 && direcao == 1){// se psico e legis e direcao forem iguais, exibir na tela que o usuario foi aprovado
			System.out.println("VOC� FOI APROVADO!");
			
		}else {
			System.out.println("VOC� FOI REPROVADO!"); // se alguma n�o for verdadeira, exibe que o usuario foi reprovado
			
		}
		
		
			entrada.close(); // fechei o scanner
		

	}


	}
