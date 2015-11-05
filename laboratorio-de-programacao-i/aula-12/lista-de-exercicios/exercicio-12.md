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

