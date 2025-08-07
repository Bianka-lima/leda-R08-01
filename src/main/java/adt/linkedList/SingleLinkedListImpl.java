package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;
	protected SingleLinkedListNode<T> tail;
	protected int elements;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
		this.tail = new SingleLinkedListNode<T>();
		elements = 0;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int size() {
		return elements;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> nodeAux = head;
		SingleLinkedListNode<T> resposta = null;
		while (nodeAux != null) {
			if (element instanceof SingleLinkedListNode) {	
				if (nodeAux.equals(element)) {
					resposta = nodeAux;
				}
			}
			nodeAux = nodeAux.getNext();
		}
		
		return (T)resposta;
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> newNode = new SingleLinkedListNode<T>(element, null);
		if (isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	@Override
	public void remove(T element) {
		SingleLinkedListNode<T> nodeAux = head;
		SingleLinkedListNode<T> prevAux = null;
		while (nodeAux != null) {
			if (element instanceof SingleLinkedListNode) {
				if (nodeAux.equals(element)) {
					if (prevAux == null) {
						
					}
					prevAux.setNext(nodeAux.next);
				}
			}
		}
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
