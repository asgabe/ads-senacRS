# Aula 01 #

## Algoritmos e Programação I ##

**(Prof. Lucia Saccomori)**

### Fato Histótico Computadores ###

ENIAC

Em 1942, o físico John Mauchly propôs uma máquina de calcular totalmente eletrônica. O Exército dos EUA, enquanto isso, necessário para calcular complexas em tempo de guerra balística tabelas. Proposta encontrou patrono.
O resultado foi ENIAC (Electronic Numerical Integrator e computador), construída entre 1943 e 1945, o primeiro computador de grande escala para executar em velocidade eletrônico sem ser retardado por quaisquer peças mecânicas. Por uma década, até 1955 uma greve relâmpago, ENIAC pode ter executar cálculos mais do que toda a humanidade tinha feito até aquele ponto.

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-01/img/eniac.jpg "ENIAC")

### O que é programação ? ###

 + Programação é o ato de projetar e implementar programas de computador.
 + Programa é a seqüência de etapas necessárias para um computador realizar uma tarefa.
 + Programadores desenvolvem programas para fazer com que os computadores realizem novas tarefas.

### O que preciso saber para programar ? ###

**(ALGORITMOS E LINGUAGEM DE PROGRAMAÇÃO)**

### Algotitmos ###

 + Para resolver um problema no computador é necessário que seja primeiramentre econtrado uma maniera de descrever este problema de um forma clara e precisa.
 + É preciso que encontremos uma sequência de passoas que permitem que o problema possa ser resolvido de maneira automática e repetitiva. Esta sequência de passos é chamada de algoritmo.
 + A linguagem algorítmica é similar a uma linguagem de programação;
 + Logo, aprendendo a criar algoritmos, estamos aptos a programar em qualquer linguagem de programação;
 + Um algoritmo não é a solução de um problema, pois, se assim fosse, cada problema teria um único algoritmo.
 + Um algoritmo é um 'caminho' para a solução de um problema e, em geral, existem muitos caminhos que levam a uma solução satisfatória, ou seja, para resolver o mesmo problema podemos obter vários algoritmos diferentes.

### Por que criamos algoritmos ? ###

 + Linguagem natural não pode ser interpretada por um computador;
 + Computadores são projetados para executar tarefas bem determinadas a partir de determinadas instruções;
 + Para desenvolver software, utilizamos linguagens de programação;

### Objetivo ao final da disciplina ###

 + Adquirir capacidade de transformar qualquer problema em um algoritmo de boa qualidade, ou seja, a intenção é que você aprenda a Lógica de Programação.
 + Adquirir uma base suficientemente boa, para que você domine os algoritmos e esteja habilitado a aprender uma Linguagem de Programação posteriormente.

### Problema ###
 + Descobrir a altura da pessoa mais alta de um grupo de pessoas. Suponha que estas pessoas estão em sequência, como em uma fila de banco, e que esta fila não está vazia.

### Solução ###
 + Pegue a altura da primeira pessoa. Esta é a única **informação** que você tem até o momento. Então, “guarde” a informação.
 + Percorra cada uma das próximas pessoas e faça o seguinte:
 ... Pegue a altura da pessoa, esta é a altura atual.
 ... Compare a altura atual com a máxima até o momento. Esta comparação pode resultar em três possibilidades: **a altura atual é menor, é igual ou é maior.**
 ... Se a altura atual for maior, então faça o valor da altura máxima ser igual a atual.