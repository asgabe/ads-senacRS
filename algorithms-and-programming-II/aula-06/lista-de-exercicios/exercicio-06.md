# Lista de Exercícios #

## Aula 06 ##

[ 1 ] Faça um algoritmo, para simular uma urna de votação para exatamente 3
candidatos (candidato A, candidato B e candidato C).  Apresente ao eleitor os as
opções de 1 a 3 com nomes dos candidatos e solicite qual candidato deseja votar.
Permita votos em branco (opção 4) e termine o processo de votação, com a
opção 5-FIM da votação. Ao término de toda a entrada, apresente o nome do
candidato, a quantidade de votos e o percentual de cada candidato. Apresente
também a quantidade e o percentual dos votos em branco e quem foi o ganhador
da eleição.

```java
variaveis = cand_a = 0,
			cand_b = 0,
			cand_c = 0,
			votos_branco = 0,
			total = 0,
			perc_a = 0,
			perc_b = 0,
			perc_c = 0,
			perc_branco = 0,
			optin = 1;

variavel = msg;


ENTRADO
	ENQUANTO (option != 5)
		Escreva(# URNA ELEITORAL #" +
				"\n[1] Candidato A" +
				"\n[2] Candidato B" +
				"\n[3] Candidato C" +
				"\n[4] Branco" 	  	+
				"\n[5] Encerrar Eleições");
	Leia option;
PROCESSAMENTO
		switch(option)
			case 1:
				cand_a = cand_a + cand_a;
				break;
			case 2:
				cand_a = cand_b + cand_b;
				break;
			case 3:
				cand_a = cand_c + cand_c;
				break;
			case 4:
				cand_a = votos_branco + votos_branco;
				break;
			case 5:
				Escreva("Eleições Encerradas!");
				break;
			default:
				Escreva("Opçõa Invalida ,apenas de 1 à 5"");
		FIM-SWITCH
			/* Calculando o percentual */
			total = cand_a + cand_b + cand_c;
			perc_a = (cand_a / total) * 100;
			perc_b = (cand_b / total) * 100;
			perc_c = (cand_c / total) * 100;
			perc_branco = (votos_branco / total) * 100;
	FIM-ENQUANTO
	/* Variavel de retorno de mensagem */
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
SAIDA
	SE (cand_a > cand_b && cand_a > cand_c)
		ENTAO
			Escrever("Candidato A WIN!")
			Escrever(msg)
	SENAO SE (cand_b > cand_a && cand_b > cand_c)
		ENTAO
			Escrever("Candidato B WIN!")
			Escrever(msg)
	SENAO SE (cand_c > cand_a && cand_c > cand_b)
		ENTAO
			Escrever("Candidato C WIN!")
			Escrever(msg)
	FIM-SE
```