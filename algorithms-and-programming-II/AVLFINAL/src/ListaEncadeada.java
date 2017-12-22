import java.util.Iterator;

public class ListaEncadeada implements Iterable<Object> {

	private static class No {
		/* implementacao da classe No. */
		public Object dado;
		private No next;
		private No prev;

		public No(Object o) {
			this.dado = o;
			this.next = null;
			this.prev = null;
		}

		public void setNext(No next) {// define proximo nó
			this.next = next;
		}

		public No getNext() {// retorna proximo nó
			return next;
		}

		public void setPrev(No prev) {// define nó anterior
			this.prev = prev;
		}

		public No getPrev() {// retorna nó anterior
			return prev;
		}
	}

	private static class ListaIterador implements Iterador, Iterator<Object> {
		/* implementacao da classe ListaIterador. */
		private No current = null;

		@Override
		public boolean hasNext() {
			if (current == null)
				current = head;
			return current.getNext() != null;
		}// ---

		@Override
		public Object next() {
			if (current == null)
				current = head;
			if (hasNext()) {
				current = current.getNext();
				return current.dado;
			} else {
				return "Não possui elemento.";
			}
		}

		@Override
		public void insertAfter(Object dado) {
			No no = new No(dado);
			if (current == null)
				current = head;
			no.setPrev(current);
			if (hasNext()) {
				no.setNext(current.getNext());
				current.getNext().setPrev(no);
			} else {
				tail = no;
			}
			current.setNext(no);

		}

		@Override
		public void append(Object dado) {
			No no = new No(dado);
			No proximo = current.getNext();
			no.setNext(proximo);
			current.setPrev(no);
			if (proximo == null) {
				tail = no;
			}
		}// ---

		@Override
		public void remove() {
			if (current == null)
				current = head;
			if (hasPrevious()) {
				current.getPrev().setNext(current.getNext());
			} else {
				head = current.getNext();
				head.setPrev(null);
			}
			if (hasNext()) {
				current.getNext().setPrev(current.getPrev());
			} else {
				tail = current.getPrev();
				tail.setNext(null);
			}
			current = current.getNext();

		}

		@Override
		public void insertBefore(Object o) {
			No no = new No(o);
			if (current == null)
				current = head;
			no.setNext(current);
			if (hasPrevious()) {
				no.setPrev(current.getPrev());
				current.getPrev().setNext(no);
			} else {
				head = no;
			}
			current.setPrev(no);

		}

		@Override
		public boolean hasPrevious() {
			if (current == null)
				current = head;
			return current.getPrev() != null;
		}

		@Override
		public Object previous() {
			if (current == null)
				current = head;
			if (hasPrevious()) {
				current = current.getPrev();
				return current.dado;
			} else {
				return "Não possui elemento.";
			}
		}

	}// fim do listaIterador

	private static No head = null;
	private static No tail = null;

	/* Insere o objeto no fim da lista. */
	public void append(Object o) {
		No no = new No(o);
		if (tail == null) {
			head = no;
		} else {
			tail.setNext(no);
			no.setPrev(tail);
		}
		tail = no;
	}

	/* Insere o objeto no inicio da lista. */
	public void addFirst(Object o) {
		No no = new No(o);
		if (head == null) {
			head = no;
			tail = no;
		} else {
			no.setNext(head);
			head.setPrev(no);
		}
		head = no;
	}

	/* Remove o objeto da lista. */
	/* public void remove(Object o); */

	/* Recupera o iterador para o primeiro no da lista. */
	public Iterador iterador() {
		return new ListaIterador();
	};

	/* Recupera o iterador para o primeiro no da lista. */
	/*
	 * public Iterador getFirst(){ return head; };
	 */

	/* Recupera o iterador para o ultimo no da lista. */
	/* public Iterador getLast(); */

	/* Testa se o objeto existe na lista. */
	public boolean hasObject(Object o) {
		if (head != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterador();
	};

}