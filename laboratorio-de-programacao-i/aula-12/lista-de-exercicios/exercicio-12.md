# Lista de Exercícios #

## Aula 12 ##

+ Leia um número e exiba os números impares entre 1 e o número informado.

```java
package exer01;

public class Impar {

	public int numero;
	public String mensagem;

	public void verificaImpar() {

		if (numero % 2 == 1) {
			mensagem = "Impar:" + numero;
		} else {
			mensagem = "";
		}
	}

}
```

```java
package exer01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Impar impar = new Impar();
		
		int numero;
		
		System.out.println("Número:");
		numero = ler.nextInt();
		
		for (int i = 2; i < numero; i++) {
			impar.numero = i;
			impar.verificaImpar();
			System.out.println(impar.mensagem);
		}

	}

}
```
+ Ler a idade de 10 pessoas e exibir quantas são maiores de idade. Para isto, crie uma classe principal para instanciar a classe MaiorIdade, a seguir.

```java
package exer02;

public class MaiorIdade {

	public int idade;
	public int contIdade;

	public void verificaMaiorIdade() {
		if (idade >= 18) {
			contIdade++;
		}
	}

}
```

```java
package exer02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		MaiorIdade maior = new MaiorIdade();
		
		int maiorIdade;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Idade:");
			maiorIdade = ler.nextInt();
			maior.idade = maiorIdade;
			maior.verificaMaiorIdade();
		}
		System.out.println(maior.contIdade + "pessoas são maiores de idade.");
	}

}
```

+ 3- Desenvolver uma classe Java chamada Apolice com os seguintes atributos públicos:
 + idade
 + valorPremio
 + cidade

**A classe Apolice deverá conter os seguintes métodos:**
+ `calcularPremioApolice()` : Este método não retorna valor e deverá calcular o valor do prêmio seguindo as seguintes regras: 
 + Quando a idade for superior a 18 e menor ou igual a 25 anos, use a fórmula: `valorPremio += (valorPremio * 20)/100`.
 + Quando a idade for superior a 25 e menor ou igual a 36 anos, use a fórmula: `valorPremio += (valorPremio *15)/100`. 
 + Quando a idade for superior a 36, use a fórmula `valorPremio += (valorPremio * 10)/100`.
+ calculaDesconto(): Este método retorna o valor do desconto apurado conforme a seguinte regra:
 + caso a cidade seja POA,Canoas e Esteio dar 10% de desconto.
 + caso a cidade seja Caxias, Viamão e Alvorada dar 5 % de desconto
 + As demais cidades ganham 12% de desconto

**Desenvolver uma segunda classe Java chamada PrincipalApolice com as seguintes características:**
+ Criar um objeto de classe Apolice:
 + Esta classe deve permitir que seja calculado o valor do prêmio de vários clientes. Enquanto não for informada a opção de FIM.
 + Solicitar que o usuário informe os valores para idade,valorPremio e cidade com a seguinte convenção: (1) PortoAlegre, (2) Canoas, (3) Esteio, (4) Caxias, (5) Viamão, (6) Alvorada.
 + Executar o método calcularPremioApolice().
 + Exibir na tela o valor do Premio.
 + Executar o método calculaDesconto().
 + Exibir na tela o valor do Desconto.

```java
package exer03;

public class Apolice {
	public int idade;
	public double valorPremio;
	//String[][] cidade = { { "poa", "canoas", "esteio" }, { "caxias", "viamão", "alvorada" } };
	int cidade;

	public void calcularPremioApolice() {
		if (idade > 18 && idade <= 25) {
			valorPremio += (valorPremio * 20) / 100;

		} else if (idade > 25 && idade <= 36) {
			valorPremio += (valorPremio * 15) / 100;

		} else if (idade > 36) {
			valorPremio += (valorPremio * 10) / 100;
		}
	}

	public String calculaDesconto() {
		String desconto = null;
		
		if (cidade == 1 || cidade == 2 || cidade == 3) {
			//desconto = (desconto * 10) / 100;
			desconto = "10%";
			
		} else if(cidade == 4 || cidade == 5 || cidade == 6) {
			//desconto = (desconto * 5) / 100;
			desconto = "5%";
		}
		
		return desconto;
	}
}
```

```java
package exer03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Apolice apolice = new Apolice();
		
		int idade, cidade, option = 0;
		double valorPremio;
		
		
		while(option != 2){
			System.out.println("### MENU ### \n1 - Calculando Apolice \n2 - Sair");
			option = ler.nextInt();
			
			if (option != 2) {
				System.out.println("Infome sua Idade");
				idade = ler.nextInt();
				apolice.idade = idade;
				
				System.out.println("Informe o Valor do Premio");
				valorPremio = ler.nextDouble();
				apolice.valorPremio = valorPremio;
				
				System.out.println("## Cidade ## \n(1) Porto Alegre \n(2) Canoas \n(3) Esteio \n(4) Caxias \n(5) Viamão \n(6) Alvorada");
				cidade = ler.nextInt();
				apolice.cidade = cidade;
				
				apolice.calcularPremioApolice();
				System.out.println("R$ " + apolice.valorPremio);
				
				System.out.println("Desconto de " + apolice.calculaDesconto());
				
			}
		}

	}

}
```

