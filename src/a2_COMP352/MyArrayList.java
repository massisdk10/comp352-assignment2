package a2_COMP352;

public class MyArrayList<E> implements List<E> {

	private E[] elements;
	private int size;
	
	
	//default constructor
	public MyArrayList() {
		elements = (E[]) new Object[10];
        size = 0;
	}
	
	//param constructor
	public MyArrayList(int capacity) {
		if (capacity<= 0)
			throw new IllegalArgumentException("Initial capacity must be greater than 0.");
		elements = (E[]) new Object[capacity];
		size = 0;
	}
	
	//Implemented methods 
	
	//adding element at the end
	public Boolean add(E e) {
		if (size == elements.length) {
            E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
		}
		elements[size] = e;
		size++;
		return true;
	}
		
	//Insert at index
	public void add(int index, E e) {
		if (index < 0 || index > size) 
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        
        if (size == elements.length) {
            E[] newArray = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = e;
        size++;
	}
		
		//remove all the elements
		public void clear() {
			for (int i = 0; i < size; i++) {
	            elements[i] = null;
	        }
	        size = 0;

	        if (elements.length > 10) {
	            elements = (E[]) new Object[10];
	        }
		}
		
		//remove at index
		public E remove(int index) {
			if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }

	        E removedElement = elements[index];

	        for (int i = index; i < size - 1; i++) {
	            elements[i] = elements[i + 1];
	        }

	        elements[size - 1] = null;
	        size--;

	        if (elements.length > 10 && size < elements.length / 4) {
	            int newCapacity = elements.length / 2;
	            if (newCapacity < 10) {
	                newCapacity = 10;
	            }

	            E[] newArray = (E[]) new Object[newCapacity];
	            for (int i = 0; i < size; i++) {
	                newArray[i] = elements[i];
	            }
	            elements = newArray;
	        }

	        return removedElement;
		}
		
		//remove object the first occurence
		public Boolean remove(Object o) {
			for (int i = 0; i < size; i++) {
	            if (o == null) {
	                if (elements[i] == null) {
	                    remove(i);
	                    return true;
	                }
	            } else {
	                if (o.equals(elements[i])) {
	                    remove(i);
	                    return true;
	                }
	            }
	        }
	        return false;
		}
		
		//return umber of elements
		public int size() {
			return size;
		}
		
		// Returns a string representation of this list
		public String toString() {
			String str = "Here are the elements of the arraylist: ";
	        for (int i = 0; i < size; i++) {
	            str += elements[i];
	            if (i < size - 1) {
	                str += ", ";
	            }
	        
	        }
	        return str;
		}
		
}
