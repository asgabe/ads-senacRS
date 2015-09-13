# Lista de Exercícios Aula 02 #

## Aula 02 ##

 + Faça a abstração dos problemas concretos a seguir, construindo algoritmos utilizando o pseudocódigo.
 + Identifique as ENTRADAS , PROCESSAMENTO E SAÍDAS.

(1) Em uma universidade esta sendo realizada uma pesquisa, para apurar o perfil dos alunos do curso de ADS. Faça um algoritmo que solicite a quantidade total de homens e a quantidade total de mulheres de uma turma da faculdade. Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

```java
variaveis = qtdHomens, qtdMulheres, ,percentual_homens, percentual_mulheres, total;
Dados de ENTRADA
	Escreva("Quantidade de Homens:");
	Leia qtdHomens;
	Escreva("Quantidade de Mulheres");
	Leia qtdMulheres;
PROCESSAMENTO
	total = qtdHomens + qtdMulheres;
	percentual_homens = (qtdHomens / total) * 100;
	percentual_mulheres = (qtdMulheres / total) * 100;
SAIDA
	Escreva("percentual_homens" + "%");
	Escreva("percentual_mulheres" + "%");
```

(2) Faça um algoritmo que efetue o cálculo da quantidade de litros de combustível gastos em uma viagem, sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média. Utilizar as seguintes fórmulas:
 * distancia = tempo * velocidade
 * litros_usados = distancia / 12

```java
variaveis = tempo, velocidade_media, distancia, litros_usados;
Dados de ENTRADA
	Escreva "Tempo de Viagem:"
	Leia tempo;
	Escreva "Velocidade Média:"
	Leia velocidade_media;
PROCESSAMENTO
	distancia = tempo * velocidade_media;
	litros_usados = distancia / 12;
SAIDA
	Escreva("Velocidade Média " + velocidade_media);
	Escreva("Tempo gasto na viagem " + tempo);
	Escreva("Distancia percorrida " + distancia);
	Escreva("Quantidade de Litros ultilizados na viagem " + litros_usados);
```