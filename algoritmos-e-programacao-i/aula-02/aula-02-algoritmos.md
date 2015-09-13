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

```java
Dados de ENTRADA
	Escreva "Informe a primeira nota do aluno:"
	Leia n1
	Escreva "Informe a segunda nota do aluno:"
	Leia n2
PROCESSAMENTO
	Calcule Média = (n1 + n2) / 2
Dados de SAIDA
	Exiba Média
```
### Teste de Mesa ###

Após desenvolver um algoritmo ele deverá sempre ser testado. Este teste é chamado de **TESTE DE MESA**, que significa, seguir as instruções do algoritmo de maneira precisa para verificar se o procedimento utilizado está correto ou não,  escrevendo todas as variáveis e resultados em uma tabela.

```java
Dados de ENTRADA
	Escreva "Informe a primeira nota do aluno:"
	Leia n1 [5,0]
	Escreva "Informe a segunda nota do aluno:"
	Leia n2 [7,00]
PROCESSAMENTO
	Calcule Média = (n1 + n2) / 2 [5,0 + 7,0 / 2]
Dados de SAIDA
	Exiba Média [6,0]
```

### Estrutura de seleção  ###

Na **estrutura de seleção**, uma condição deve ser analisada e, a partir do resultado da análise, um "caminho" do algoritmo será executado. Em outras palavras, uma estrutura de seleção escolhe ações a serem executadas a partir de uma condição (que pode ser simples ou composta).

### Algumas Palavras Chave Portugol ###
 + Se
 + Então
 + Se não

### Exemplo de Algoritmo Portugol ###

Imagine o seguinte problema: Exibir o resultado final de um aluno. Para isso, calcular a média final dos alunos. Os alunos receberão 2 notas: N1, N2. Onde:

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-02/img/exemplo-01.png "Exemplo")

O aluno que atingir média superior a 6 está aprovado.

######Três perguntas######
Para montar o algoritmo proposto, faremos três perguntas:
 * Quais são os dados de entrada ?
 	* R: Os dados de entrada são N1, N2
 * Qual será o processamento a ser utilizado ?
 	* R: O procedimento será somar todos os dados de entrada e dividi-los por 2 (dois), verificar se a média é superior ou igual a 6
 * Quais serão os dados de saída ?
  	* R: Exibir o resultado Final

######Algoritmo em Portugol######

```java
Dados de ENTRADA
	Escreva "Informe a primeira nota do aluno:"
	Leia n1
	Escreva "Informe a segunda nota do aluno:"
	Leia n2
PROCESSAMENTO
	Calcule Média = (n1 + n2) / 2
	Se média > = 6
	então Resultado = Aprovado
	Se não
	Resultado = Reprovado
Dados de SAIDA
	Exiba Resultado
```
### Bibliografia ###

Para a elaboração deste material foram consultados vários tipos de materiais, como por exemplo: livros, apostilas, páginas web etc. Algumas das referências consultadas estão apresentadas a seguir:
 + DEITEL, H. M.; DEITEL, P. J. Java: como programar. 6. ed. São Paulo: Bookman, 2007. 1110 p. ISBN 8576050196
 + HORSTMANN, Cay. **Big Java**. Porto Alegre: Bookman, 2006. 1125 p. ISBN 853630345X 
**CS-14** Algoritmos e Estrutura de Dados em Java – Disponível em: caelum.com.br
 + BUFFONI, Salete. Apostila de Algoritmo Estruturado - 4ª edição. Disponível em: http://www.saletebuffoni.hpg.ig.com.br/algoritmos/Algoritmos.pdf.
 + GOMES, Abel. **Algoritmos, Fluxogramas e Pseudo-código - Design de Algoritmos**. Disponível em: http://mail.di.ubi.pt/~programacao/capitulo6.pdf.

# GOTAS DE SABEDORIA #

##### LEMBRE-SE EM TODOS OS CÁLCULOS: #####

1º Operações dentro dos parênteses (se houver);
2º Operações dentro dos colchetes (se houver);
3º operações dentro das chave ( se houver).

Em todas elas:

Multiplicações e divisões primeiro, somas e subtrações depois.



##### PORCENTAGENS #####

**Exemplo:** `5,00% de 500,00`

```java
(5,00 x 500,00) / 100
2.500,00 / 100 = 25,00
```

ou simplesmente pula duas casas para a esquerda: `5% = 0,05`

`0,05 x 500 = 25,00`

**Exemplo :** `15,00% de 1.200,00`

```java
15% = 0,15
0,15 x 1.200,00 = 180,00
```

**Exemplo:** `148% de 4.600,00`

`148% = 1,48`
`1,48 x 4.600,00 = 6.808,00`


**VALOR COM UM ACRÉSCIMO PERCENTUAL**

**Acrescentar 1 e multiplicar**

```java
100,00 com acréscimo de30%  =  100,00 x 1,30 =, 130,00
200,00 com acréscimo de25% =  200,00 x 1,25 = 250,00
2.500,00 com acréscimo de17%  =  2.500,00 x 1,17 = 2.925,00
185.500,00 com acréscimo de 35,9%  =  185.500,00 x 1,359 = 252.094,50
185.500,00 com acréscimo de 200%  =  185.500,00 x 3,00 = 556.500,00
```