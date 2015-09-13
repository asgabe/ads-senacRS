# Lista de Exercícios #

## Aula 06 ##

 + [1] Faça um algoritmo, para simular uma urna de votação para exatamente 3
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

public class exercicio_01 {
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
 + [2] Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.

```java
01
02 02
03 03 03
04 04 04 04
05 05 05 05 05
06 06 06 06 06 06
07 07 07 07 07 07 07
08 08 08 08 08 08 08 08
09 09 09 09 09 09 09 09 09
10 10 10 10 10 10 10 10 10 10
11 11 11 11 11 11 11 11 11 11 11
```

```java
package aula06;

import java.util.Scanner;

public class exercicio_02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int linha, coluna, contador = 1;
		System.out.println("Coloque o número de linhas da pirâmide");
		linha = ler.nextInt();
		while (contador <= linha) {
			coluna = 1;
			while (coluna <= contador) {
				System.out.print(contador + " ");
				coluna = coluna + 1;
			}
			System.out.println(" ");
			contador = contador + 1;
		}

	}

}
```
 + [4] Identifique o que está errado no código abaixo

package aula06;

import java.util.Scanner;

```java
public class exercicio_02 {
	public static void main(String[] args) {

		int contador = 1;

		while (contador <= 10);
			System.out.println("teste");
			contador = contador + 1;
	}

}
// R: O erro se encontra nessa linha de código "while (contador <= 10);"
```

 + [5] Qual a diferença do "while" e "do while"?
 	* **while:** Esta instrução é usada quando não sabemos quantas vezes um determinado bloco de instruções precisa ser repetido. Com ele, a execução das instruções vai continuar até que uma condição seja verdadeira. A condição a ser analisada para a execução do laço de repetição deverá retornar um valor booleano.
 	* **do while:** O do/while tem quase o mesmo funcionamento que o while, a diferença é que com o uso dele teremos os comandos executados ao menos uma única vez.