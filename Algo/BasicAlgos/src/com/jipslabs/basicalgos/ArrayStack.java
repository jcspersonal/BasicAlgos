package com.jipslabs.basicalgos;

import java.util.Iterator;

public class ArrayStack<Item> implements Iterable<Item>{
	
	private Item[] items = (Item[])new Object[2];
	private int n = 0;
	
	public boolean isEmpty(){
		return true;		
	}
	
	public int size(){
		return 0;
	}
	
	public void push(Item item){
		items[n++] = item;
		if(n == items.length){
			resize(n*2);			
		}
		
	}
	
	public Item pop(){
		Item temp = items[--n];
		if(n<= items.length/4){
			resize(n/2);			
		}
		
		return temp;
		
	}
	
	private void resize(int newsize){
		Item[] temp = (Item[])new Object[newsize];
		for(int i=0; i<n; i++){
			temp[i] = items[i];			
		}		
		items = temp;
	}
	
	public Iterator<Item> iterator(){
		return (new ReverseArrayIterator());
		
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = n;		
		public boolean hasNext(){
			return (i>0);
		}
		
		public Item next(){
			return items[--i];			
		}
		
		public void remove(){}
	}
	
}