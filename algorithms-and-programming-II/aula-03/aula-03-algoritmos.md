# Aula 03

## Algoritmos e Programação I

**(Prof. Lucia Saccomori)**

### Estrutura de repetição ###

Em vários momentos, se torna necessário repetir um trecho de um programa um determinado numero de vezes. 
Nesse caso, pode ser criado um laço de repetição que efetue o processamento de um determinado trecho, tantas vezes quantas forem necessárias. 
Os laços de repetição também são conhecidos por loopings.

### Estruturas de Controle de Fluxo ###

Uma forma de identificar a necessidade de repetição de um determinado trecho do algoritmo é imaginar que ao invés de se desejar apenas obter um resultado, o objetivo fosse obter um conjunto de Resultados. Para isso o cálculo de cada resultado deve ser repetido.

 + Java oferece três Estruturas de Controle de Fluxo:
  * Enquanto **(while)**
  + Faça Enquanto **(do... while)**
  + Para (For)

 + Estrutura ou laço de repetição – **Enquanto**

```java
EQUANTO (condicao para o termino) FACA
	<sequencia-de-instrucoees>
FIM-ENQUANTO
```
### Variáveis de Laço ###

Em estruturas de repetição torna-se necessário o uso de dois tipos de variáveis para a resolução de diversos tipos de problemas: **variáveis contadoras e variáveis acumuladoras**.

### Variáveis contadoras  ###

E uma variável de controle, “NUMERICA”, que serve para controlar quantas vezes um determinado trecho de programa foi executado.
Inicialmente recebe um valor, geralmente 0 (ZERO), antes do inicio de uma estrutura de repetição e é incrementada no interior da estrutura de uma valor constante, geralmente 1.

##### Exemplo #####

 + Faça um algoritmo para escrever  a palavra “teste” dez vezes.

```java
INICIO
	contador = 1;
	ENQUANTO (contador < = 10) FACA
		Escreva "Teste";
		contador = contador + contador
	FIM-ENQUANTO;
FIM
```
### Fluxograma Exemplo ###

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-03/img/exemplo-01.png "Exemplo")

 + Faça um algoritmo que receba o número 2 em uma variável numérica e incremente este número em 1 e o exiba, até chegar ao número 10.

```java
x = 2;
ENQUANTO (x <= 10) FACA
	IMPRIMA (x)
	x = x + x
FIM-ENQUANTO
```

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-03/img/exemplo-02.png "Exemplo")

### Variáveis Acumuladoras ###

E uma variável de controle, inteira, que serve para acumular valores.
Inicialmente recebe um valor, geralmente 0 (ZERO), antes do inicio de uma estrutura de repetição e é incrementada no interior da estrutura de uma valor variável

#### Exemplo ####

 + Faça um algoritmo para ler vários números, enquanto o número for maior que 0. Ao final exiba a soma destes números.

```java
numero = 1
ENQUANTO (numero > 0 ) FACA
	Escreva "Informe um numero"
	Ler numero
	soma = soma + numero
FIM-ENQUANTO
Escreva "soma"
```

### Bibliografia ###

 + Para a elaboração deste material foram consultados vários tipos de materiais, como por exemplo: livros, apostilas, páginas web etc. Algumas das referências consultadas estão apresentadas a seguir:
 + DEITEL, H. M.; DEITEL, P. J. Java: como programar. 6. ed. São Paulo: Bookman, 2007. 1110 p. ISBN 8576050196 
 + HORSTMANN, Cay. **Big Java**. Porto Alegre: Bookman, 2006. 1125 p. ISBN 853630345X 
 + **CS-14** Algoritmos e Estrutura de Dados em Java – Disponível em: caelum.com.br
 + BUFFONI, Salete. Apostila de Algoritmo Estruturado - 4ª edição. Disponível em: http://www.saletebuffoni.hpg.ig.com.br/algoritmos/Algoritmos.pdf.
 + GOMES, Abel. **Algoritmos, Fluxogramas e Pseudo-código - Design de Algoritmos**. Disponível em: http://mail.di.ubi.pt/~programacao/capitulo6.pdf.