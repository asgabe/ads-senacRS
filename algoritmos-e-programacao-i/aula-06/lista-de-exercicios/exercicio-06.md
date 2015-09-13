# Lista de Exercícios #

## Aula 06 ##

 + Faça um algoritmo, para simular uma urna de votação para exatamente 3
candidatos (candidato A, candidato B e candidato C).  Apresente ao eleitor os as
opções de 1 a 3 com nomes dos candidatos e solicite qual candidato deseja votar.
Permita votos em branco (opção 4) e termine o processo de votação, com a
opção 5-FIM da votação. Ao término de toda a entrada, apresente o nome do
candidato, a quantidade de votos e o percentual de cada candidato. Apresente
também a quantidade e o percentual dos votos em branco e quem foi o ganhador
da eleição.

```java
package aula06;

import java.util.Scanner;

public class exercicios_01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double  cand_a = 0,
				cand_b = 0,
				cand_c = 0,
				votos_branco = 0,
				total = 0,
				perc_a = 0,
				perc_b = 0,
				perc_c = 0,
				perc_branco = 0;

		int option = 1;
		String msg;

		while(option != 5) {
			System.out.println("# URNA ELEITORAL #" +
								"\n[1] Candidato A" +
								"\n[2] Candidato B" +
								"\n[3] Candidato C" +
								"\n[4] Branco" 	  	+
								"\n[5] Encerrar Eleições");
			option = ler.nextInt();

			switch(option) {
			case 1:
				cand_a++;
				break;
			case 2:
				cand_b++;
				break;
			case 3:
				cand_c++;
				break;
			case 4:
				votos_branco++;
				break;
			case 5:
				System.out.println("Eleições Encerradas!");
				break;
			default:
				System.out.println("Opçõa Invalida ,apenas de 1 à 5");
			}

			total = cand_a + cand_b + cand_c;
			perc_a = (cand_a / total) * 100;
			perc_b = (cand_b / total) * 100;
			perc_c = (cand_c / total) * 100;
			perc_branco = (votos_branco / total) * 100;

		}

		msg = "# Candidato A #" +
				"\nTotal de votos : " + cand_a +
				"\nPercentual : " + perc_a + "%" +
				"\n\n# Candidato B #" +
				"\nTotal de votos : " + cand_b +
				"\nPercentual : " + perc_b + "%" +
				"\n\n# Candidato C #" +
				"\nTotal de votos : " + cand_c +
				"\nPercentual : " + perc_c + "%" +
				"\n\n# Votos em Branco #" +
				"\nTotal de votos :" + votos_branco +
				"\nPercentual : " + perc_branco;
		if (cand_a > cand_b && cand_a > cand_c) {
			System.out.println("Candidato A WIN!");
			System.out.println(msg);
		} else if(cand_b > cand_a && cand_b > cand_c) {
			System.out.println("Candidato B WIN!");
			System.out.println(msg);
		} else if(cand_c > cand_a && cand_c > cand_b) {
			System.out.println("Candidato C WIN!");
			System.out.println(msg);
		}
	}

}
```