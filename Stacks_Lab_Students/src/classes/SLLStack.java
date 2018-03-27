package classes;

import interfaces.Stack;

public class SLLStack<E> implements Stack<E>
{   
	// SNode is a public class defined elsewhere. No 
	// need to have it as a private class in this case. 
	private SNode<E> top;   
	private int size; 
	
	public SLLStack() {
		top = null; 
		size = 0; 
	}
	
	public E pop() {//fix it
		SNode<E> ntr = top;
		E etr;
		if (isEmpty())
			return null; 
		
		// ADD CODE TO COMPLETE IMPLEMENTATION
		else {
			etr = ntr.getElement();
			ntr.setNext(top);
			
		}
		size--;
		ntr.clean(); 
		
		return (E) etr;
	}

	public void push(E e) {
		SNode<E> nuevo = new SNode<>();
		if (isEmpty()) {
			nuevo.setElement(e);
			top = nuevo;}
		
		else {
			nuevo.setElement(e);
			nuevo.setNext(top);
			top =nuevo;
		}
		// ADD CODE TO COMPLETE IMPLEMENTATION
		size++;
	}

	public E top() {
		if (isEmpty())
			return null;  
		return top.getElement();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}


	// The following two methods are just for testing and grading....
    public void showReverse() { 
	    if (size == 0)
		   System.out.println("Stack is empty."); 
		else
		   recSR(top);
    }
    private void recSR(SNode<E> f) { 
		if (f != null) { 
		   recSR(f.getNext()); 
		   System.out.println(f.getElement()); 
	     } 
    } 
 
}
