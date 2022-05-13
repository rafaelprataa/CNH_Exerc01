package aulas;
import java.util.Scanner;
public class CNH {
// EXERCICIO CNH
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int psico, legis, direcao; // criei as respectivas variaveis
		
		
		System.out.println("VOCÊ FOI APROVADO NO EXAME PSICOTÉCNICO? DIGITE 1 SE SIM, OU 2 SE NÃO"); // println para perguntar e o usuario digitar na linha de baixo
		psico = entrada.nextInt();
		
		System.out.println("VOCÊ FOI APROVADO NO EXAME DE LEGISLAÇÃO? DIGITE 1 SE SIM, OU 2 SE NÃO");  // println para perguntar e o usuario digitar na linha de baixo
		legis = entrada.nextInt();
		
		System.out.println("VOCÊ FOI APROVADO NO EXAME DE DIREÇÃO? DIGITE 1 SE SIM, OU 2 SE NÃO"); // println para perguntar e o usuario digitar na linha de baixo
		direcao = entrada.nextInt();
		
		if ( psico == 1 && legis ==1 && direcao == 1){// se psico e legis e direcao forem iguais, exibir na tela que o usuario foi aprovado
			System.out.println("VOCÊ FOI APROVADO!");
			
		}else {
			System.out.println("VOCÊ FOI REPROVADO!"); // se alguma não for verdadeira, exibe que o usuario foi reprovado
			
		}
		
		
			entrada.close(); // fechei o scanner
		

	}


	}
