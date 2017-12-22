
public class Main {
	private static void imprime(ListaEncadeada lista) {
		Iterador iter = lista.iterador();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------");
	}

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.append("2");
		lista.append("3");
		lista.append("4");
		lista.append("5");
		lista.append("6");
		lista.addFirst("1");
		imprime(lista);
		Iterador iter = lista.iterador();
		for (int i = 0; i < 3; i++)
			iter.next();
		iter.insertBefore("Antes do 4");
		iter.insertAfter("Depois do 4");
		imprime(lista);
	}
}