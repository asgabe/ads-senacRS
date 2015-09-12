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
 + Pegue a altura da pessoa, esta é a altura atual.
 + Compare a altura atual com a máxima até o momento. Esta comparação pode resultar em três possibilidades: **a altura atual é menor, é igual ou é maior.**
 + Se a altura atual for maior, então faça o valor da altura máxima ser igual a atual.

### Conversão de programas em códigos de máquina ###

 + O computador somente interpreta instruções em linguagem de máquina, que é composta por uma seqüência de números.
 + Pelo fato de as instruções de máquina serem codificadas como números é difícil escrever programas em código de máquina.
 + O compilador converte os programas escritos em linguagem de programação (alto nível) em código de máquina.

### Linguagem de Programação ###
 + As linguagens de programação de alto nível não dependem da arquitetura específica de um computador, mas são criações humanas. Como tal, seguem certas convenções de programação.
 + Quando um compilador interpreta as instruções de programação em uma linguagem de programação, ele irá convertê-las em código de máquina somente se a entrada seguir exatamente as convenções da linguagem.

### Qual linguagem iremos ultilizar ? ###

![alt text](https://github.com/gabcorrea/ads-senacRS/blob/master/algoritmos-e-programacao-i/aula-01/img/java-icon.png "Java")

### A linguagem de Programação JAVA ###

Em 1991 James Gosling e Patrick Naughton, da Sun Microsystems, desenvolveram uma linguagem chamada “Green”, para programar dispositivos de consumo popular. Foi projetada para ser segura e portável. Sucesso para escrever applets da internet. O mesmo programa Java pode ser executado, sem qualquer alteração, em qualquer sistema operacional.

### JVM – Java Virtual Machine ###

Para permitir que os aplicativos Java sejam executadas em sistemas operacionais diferentes, os programas contem instruções para uma JVM. A JVM é um CPU virtual simulada por um programa executado na CPU real. A JVM codifica a seqüência de instruções em uma seqüência de números

### Como estudar JAVA ###

Java tem uma biblioteca bastante extensa. Concentre-se em conhecer aquelas partes da biblioteca de que você precisará nos seus projetos de programação. Dedique algum tempo para conhecer o sistema do computador e o compilador Java que será usado em seu estudo.

### Bibliografia ###

Para a elaboração deste material foram consultados vários tipos de materiais, como por exemplo: livros, apostilas, páginas web etc. Algumas das referências consultadas estão apresentadas a seguir:
 + DEITEL, H. M.; DEITEL, P. J. Java: como programar. 6. ed. São Paulo: Bookman, 2007. 1110 p. ISBN 8576050196.
 + HORSTMANN, Cay. **Big Java**. Porto Alegre: Bookman, 2006. 1125 p. ISBN 853630345X
 + **CS-14** Algoritmos e Estrutura de Dados em Java – Disponível em: caelum.com.br
 + BUFFONI, Salete. Apostila de Algoritmo Estruturado - 4ª edição. Disponível em: http://www.saletebuffoni.hpg.ig.com.br/algoritmos/Algoritmos.pdf.
 + GOMES, Abel. **Algoritmos, Fluxogramas e Pseudo-código - Design de Algoritmos.** Disponível em: http://mail.di.ubi.pt/~programacao/capitulo6.pdf.

### O que veremos na Disciplina ###

1. Caracterização da Unidade Curricular
	* Compreensão e alteração de programas ultizando programação estruturada e orientação a objetos.
2. Competencia Essencial
	* Representar a resolução de problemas através da construção de algoritmos ultilizando conceitos de programção estruturada e orientação a objetos.
3. Elementos da Competência Relacionada
	* Ultilizar peseudocódigo na representação da solução de problemas.
	* Ultilizar estrutura de dados na solução de problemas computacionais.
	* Ultilizar objetos.
	* Implementar classes.
4. Bases Tecnológicas
	* Lógicas de programação
	* Programação orientada a objetos.
	* Variáveis, atribuição, expressões.
	* Classes, objetos, métodos, atributos, parâmetros.
	* Controle de fluxos de execução: de decisão e iteração.
	* Tipos de dados.
	* Vetores e listas.
	* Testes de mesa.
	* Representações alternativas do programa: diagramas e tabelas.
5. Estratégias de Ensino e de Aprendizagem. Serão ultilizadas as seguintes metodologias no decorrer dos bimestres:
	* Aula Expositivas
	* Ultilização de recursos de multimídia
	* Uso de laboratório
	* Utilização de material bibliográfico.

| Conceitos									  	    	|
| ----------------------------- |:---------------------:|
| Algotimos     				| Conversão de dados 	|
| Variáveis e tipos de Varáveis | Controle de exceções	|
| Operadores	 				| Orientação à objetos  |
| Construtor lógico de seleção	| Classes				|
| Estrutura de repetição		| Método				|
| Array							| Atributo				|