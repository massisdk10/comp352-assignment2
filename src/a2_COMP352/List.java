package a2_COMP352;

public interface List<E> {

	//adding element at the end
	Boolean add(E e);
	
	//Insert at index
	void add(int index, E element);
	
	//remove all the elements
	void clear();
	
	//remove at index
	E remove(int index);
	
	//remove object the first occurence
	Boolean remove(Object o);
	
	//return umber of elements
	int size();
	
	// Returns a string representation of this list
	String toString();
	
	
}
