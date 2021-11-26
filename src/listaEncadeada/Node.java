package listaEncadeada;

public class Node {
	private Node next; //proximo elemento que vai entrar na lista
	private Object item; //objeto que vai ser acumulados na lista
	
	public Node (Object item) {
		this.item = item;
		next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	
	
}
