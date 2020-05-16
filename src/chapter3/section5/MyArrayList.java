package chapter3.section5;

import java.util.Arrays;

public class MyArrayList<E> {
	private static final int INIT_CAPACITY=10;
	private E [] theData;
	private int size;
	private int capacity;
	
	public MyArrayList() {
		theData=(E[])new Object [INIT_CAPACITY];
	}
	
	public void add(int index, E anEntry) {
		if(index<0 || index>size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(size>=capacity) {
			reallocate();
			for(int i=size-1; i>=index; i--) {
				theData[i+1]=theData[i];
			}
			theData[index]=anEntry;
		}
	}
	
	
	private void reallocate() {
		capacity*=2;
		theData=Arrays.copyOf(theData, capacity);
	}

	public void add(E anEntry) {
		add(size, anEntry);
	}
	
	public int indexOf(E anEntry) {
		for(int i=0; i<size; i++) {
			if(theData[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MyArrayList<String> test= new MyArrayList<String>();
		test.add(1,"Hello");
		
		
	}
	
	

}
