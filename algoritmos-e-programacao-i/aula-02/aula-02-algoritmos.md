# Aula 02 #

## Algoritmos e Programação I ##

**(Prof. Lucia Saccomori)**

### ALGORITMOS ###

 + Sequência finita de passos que levam a execução de uma tarefa.
 + Uma sequência de instruções.
 + Instruções não redundantes e nem subjetivas.
 + Instruções claras e precisas.

### Formas de Representação de Algoritmos ###

 + Através de uma língua (português, inglês, etc.), manuais de instruções, nas receitas culinárias, bulas de medicamentos, etc.
 + O pseudocódigo, também conhecido como linguagem estruturada ou **Portugol**.
 + Através de uma linguagem de programação.
 + Através de representações gráficas: (diagrama, fluxograma, etc.)

### Algoritmos ###

Cada uma dessas formas de representar um algoritmo, tem suas vantagens e desvantagens, cabe a pessoa escolher a forma que melhor lhe convir. Nesta disciplina serão apresentadas duas formas de representação de algoritmos: Pseudocódigo e Fluxograma.

### Pseudocódigo ###

 + É uma técnica narrativa, também conhecida como português estruturado ou **portugol**.
 + Pseudocódigo, uma simbiose de Português, Algol e Pascal, Independente da linguagem de programação.

### Regras para construção do Algoritmo ###

 + Usar somente um verbo por frase
 + Usar frases curtas e simples
 + Ser objetivo
 + Evite usar palavras que tenham sentido dúbio
 + Procure dividir o problema em etapas menores

### Fases Fundamentais ###

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-02/img/fases-fundamentais.png "Fases Fundamentais")

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-02/img/fases.png "Fases Fundamentais")

 + **ENTRADA:** São os dados de entrada do algoritmo
 + **PROCESSAMENTO:** Procedimentos utilizados para chegar ao resultado final
 + **SAÍDA:** São os dados já processados

### Método para Construção de Algoritmos ###

 + ler atentamente o enunciado do problema, compreendendo-o e destacando os pontos mais importantes;
 + definir os dados de entrada, ou seja, quais dados serão fornecidos;
 + definir os dados de saída, ou seja, quais dados serão gerados depois do processamento;
 + definir o processamento, ou seja, quais cálculos serão efetuados e quais as restrições para esses cálculos. O processamento é responsável pela obtenção dos dados de saída com base nos dados de entrada;
 + definir as variáveis necessárias para armazenar as entradas e efetuar o processamento;
 + elaborar o algoritmo;
 + testar o algoritmo realizando simulações.

### Estruturas básicas ###

 + Existem três estruturas básicas para a construção de algoritmos: ***sequenciacão**, **seleção** e **repetição**.
 + A combinação destas três estruturas permite-nos a construção de algoritmos para a resolução de problemas extremamente complexos.

### Estrutura de sequência ###

 + Uma **estrutura de sequência**, caracteriza-se por possuir uma única sequência de ações, que é executada apenas uma vez.

### Algumas Palavras Chave Portugol ###
 + Inicio
 + Fim
 + Leia
 + Escreva
 + Imprima
 + Calcule

### Exemplo de Algoritmo Portugol ###

Imagine o seguinte problema: Calcular a média final dos alunos. Os alunos receberão 2 notas: N1, N2. Onde:

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-02/img/exemplo-01.png "Exemplo")

### Três perguntas: ###
 + Para montar o algoritmo proposto, faremos três perguntas:
 	1. Quais são os dados de entrada ? **R: Os dados de entrada são N1, N2**
 	2. Qual será o processamento a ser utilizado ? **R: O procedimento será somar todos os dados de entrada e dividi-los por 2 (dois)**
 	3. Quais serão os dados de saída ? **R: O dado de saída será a média final**

### Algoritmo em Portugol ###

```javascript
Dados de ENTRADA
	Escreva "Informe a primeira nota do aluno:"
	Leia n1
	Escreva "Informe a segunda nota do aluno:"
	Leia n2
PROCESSAMENTO
	Calcule Média = (n1 + n2) / 2
Dados de SAÍDA
	Exiba Média
```