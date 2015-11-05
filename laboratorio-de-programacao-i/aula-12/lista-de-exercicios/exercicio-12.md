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

+ Desenvolver uma classe Java chamada Apolice com os seguintes atributos públicos:
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
				
				System.out.println( 
									"## Cidade ## \n(1) Porto Alegre \n(2) Canoas \n(3) Esteio
									\n(4) Caxias \n(5) Viamão \n(6) Alvorada");

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

+ Desenvolver uma classe Java chamada ValorCompra com os seguintes atributos:
 + valorCompra
 + qtdParcelas
 + desconto
 + tipoCliente
 + valorParcela

**A classe ValorCompra deverá conter os seguintes métodos**
+ `oferecerDesconto()`: Este método não retorna valor.
 + Caso o cliente seja tipo 1 = ouro , oferecer 10%.
 + Caso o cliente seja tipo 2 = Prata , oferecer 5%.
 + Caso o cliente seja tipo 3 = bronze não oferecer desconto.
+ `calculaValorParcela()`: Este método não retorna valor e calcula o valor das parcelas , conforme a quantidade de parcelas informadas.

**Desenvolver uma segunda classe Java chamada Principal com a seguinte estrutura**
+ Criar um objeto da classe ValorCompra.
+ Para cada atributo da classe atribuir um valor coerente informado pelo usuário.
+ Exibir o valor das parcelas na tela.

```java
package exer04;

public class valorCompra {
	public double valorCompra;
	public int qtdParcelas;
	public double desconto;
	public int tipoCliente;
	public double valorParcela;
	
	public void oferecerDesconto() {
		if (tipoCliente == 1) {
			desconto = (valorCompra * 10) / 100;
		} else if(tipoCliente == 2) {
			desconto = (valorCompra * 5) / 100;
		} else {
			desconto = 0;
		}
	}
	
	public void calcularValorParcela() {
		valorParcela = (valorCompra - desconto) / qtdParcelas;
	}

}
```

```java
package exer04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		valorCompra compra = new valorCompra();
		
		double valorCompra;
		int qtdParcela, tipoCliente;
		
		
		System.out.println("Valor da Compra:");
		valorCompra = ler.nextDouble();
		compra.valorCompra = valorCompra;
		
		System.out.println("## TIPO DE CLIENTE \n[1] GOLD \n[2] PRATA \n[3] BRONZE");
		tipoCliente = ler.nextInt();
		compra.tipoCliente = tipoCliente;
		
		System.out.println("Nº Parcelas :");
		qtdParcela = ler.nextInt();
		compra.qtdParcelas = qtdParcela;
		
		compra.oferecerDesconto();
		compra.calcularValorParcela();
		
		System.out.println(compra.valorParcela);
	}

}
```
+ Desenvolver  uma classe Java chamada ContaCorrente com os seguintes atributos:
 + Número da agência
 + Número da conta
 + Nome do cliente
 + Saldo = 1000

**Esta classe deverá ter os seguintes métodos.**

+ `saque(valorSaque)`: Este método recebe por parâmetro o valor que deve ser sacado da conta e para efetua o saque do saldo.
+ `deposito(valorDeposito)`: Este método recebe por  parâmetro valor que deve ser depositado na conta e efetua o deposito no saldo.

**Desenvolver uma classe chamada Principal**
 + Que mostre uma caixa de mensagem para o cadastramento do **Número da agência, Número da conta, Nome do cliente**.
 + Mostre uma caixa de mensagem com as opções:
  + (1) Saque
  + (2) Depósito
  + (3) Fim

```java
package exer05;

public class ContaCorrente {
	public int numAgencia;
	public int numConta;
	public String nomeCliente;
	public double saldo = 1000;
	
	public double saque(double valor) {
		saldo = saldo - valor;
		
		return saldo;
	}
	
	public double deposito(double deposito) {
		saldo =  saldo + deposito;
		
		return saldo;
	}
}
```

```java
package exer05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		int numAgencia, numConta, option = 0;
		double saque, deposito;
		String nomeCliente;

		System.out.println("Nº Agencia:");
		numAgencia = ler.nextInt();
		conta.numAgencia = numAgencia;

		System.out.println("Nº Conta:");
		numConta = ler.nextInt();
		conta.numConta = numConta;
		
		System.out.println("Nome do Cliente:");
		nomeCliente = ler.nextLine();
		conta.nomeCliente = nomeCliente;

		while (option != 3) {
			System.out.println("## CAIXA ELETRONICO ## \n1 - SAQUE \n2 - DEPÓSITO \n3 - FIM ");
			option = ler.nextInt();

			switch (option) {
			case 1:
				System.out.println("Valor do Saque:");
				saque = ler.nextDouble();
				conta.saque(saque);
				break;
			case 2:
				System.out.println("Valor do Depósito:");
				deposito = ler.nextDouble();
				conta.deposito(deposito);
				break;
			default:
				break;
			}
		}

		//System.out.println("R$ " + conta.saldo);

	}

}
```
