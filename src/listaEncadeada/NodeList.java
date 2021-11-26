package listaEncadeada;

public class NodeList {
	private Node head = null; //cabeça da lista = primeiro elemento
	private Node tail = null; //cauda da lista = ultimo elemento da lista
	private int listSize = 0;
	
	public void addH (Object item) { //adicionar no começo da lista 
		Node n = new Node(item);
		if (isEmpty()) { //se não houver nenhum elemento na lista
			head = n; //o primeiro vai ser o que acabou de ser criado
			tail = n; //o ultimo também vei ser o que acabou de ser criado
		}
		else { //caso já exista um elemento na lista
			n.setNext(head);//novo elemento seta o 1° elemento que já existe na lista como proximo dele
			head = n; //novo elemento passa a ser o primeiro
		}
		 listSize++; //incrementamos a lista 
	}
	
	public void removeH() { //remover do começo
		
		Node aux = head; //cria um elemento auxiliar para apontar o primeiro elemento da fila
		head = aux.getNext(); //seta o primeiro elemento como o proximo do que vai ser removido
		aux.setNext(null); //remove o ponteiro dele para o proximo
		
		//como ele não vai ter mais referencia para proximo, nem primeiro e nem ultimo o garbage colector se encarrega de removê-lo da memória
		listSize--;
	}
	
	
	public void addE(Object item) {
		Node n = new Node(item);
		
		if (isEmpty()) {
			addH(item);
		}
		else {
			tail.setNext(n);
			n.setNext(null);
			tail = n;
		}
		listSize++;
	}
	
	public Object removeE() {
		Node aux = head;
		
		while (aux != null) {
			
			if(aux.getNext() == tail) {
				Node aux2 = tail;
				tail = aux;
				tail.setNext(null);
				return aux2.getItem();
			}
			aux = aux.getNext();
		}

		listSize --;
		return null;
		
	}
	
	public void createReport() {
		Node aux = head;
		
		while (aux != null) {
			aux.getItem().toString();
			aux = aux.getNext();
		}
	}
	
	private boolean isEmpty() { //esse metodo verifica se o primeiro elemento esta vazio, se estiver a lista esta vazia
		return head == null;
	}
}
