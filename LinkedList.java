class LinkedList{

	ListNode firstNode;
	ListNode lastNode;
	int size;

	public LinkedList(){
		size = 0;
	}

	public void add(int value){
		ListNode node = new ListNode();
		node.value = value;

		if (firstNode == null){
			firstNode = node;
			lastNode = node;
		}else{
			node.previous = lastNode;
			lastNode.next = node;
			lastNode = node;
		}

		size++;
	}

	public int size(){
		return size;
	}

	public int get(int index) throws IndexOutOfBoundsException{
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		else{
			ListNode node = firstNode;
			for(int i = 0; i < index; i++){
				node = node.next;
			}
			return node.value;
		}
	}

	class ListNode{
		public ListNode previous, next;
		public int value;

		// public void setValue(int value){ this.value = value; }
		// public int getValue(){ return value; }

	}

}