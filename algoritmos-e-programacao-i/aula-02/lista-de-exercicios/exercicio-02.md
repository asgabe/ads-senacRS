# Lista de Exercícios Aula 02 #

## Aula 02 ##

 + Faça a abstração dos problemas concretos a seguir, construindo algoritmos utilizando o pseudocódigo.
 + Identifique as ENTRADAS , PROCESSAMENTO E SAÍDAS.

1. Em uma universidade esta sendo realizada uma pesquisa, para apurar o perfil dos alunos do curso de ADS. Faça um algoritmo que solicite a quantidade total de homens e a quantidade total de mulheres de uma turma da faculdade. Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.


```java
Dados de ENTRADA
	Escreva "Quantidade de Homens:"
	Leia qtdHomens
	Escreva "Quantidade de Mulheres"
	Leia qtdMulheres
PROCESSAMENTO
	total = qtdHomens + qtdMulheres
	percentual_homens = (qtdHomens / total) * 100;
	percentual_mulheres = (qtdMulheres / total) * 100;
SAIDA
	Escreva "percentual_homens" + "%"
	Escreva "percentual_mulheres" + "%"
```