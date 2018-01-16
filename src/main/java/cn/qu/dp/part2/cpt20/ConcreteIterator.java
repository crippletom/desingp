package cn.qu.dp.part2.cpt20;

import java.util.Vector;

public class ConcreteIterator implements Iterator {
	
	private Vector<Object> vector=new Vector<Object>();
	
	private int cursor;
	
	public ConcreteIterator(Vector<Object> vector) {
		this.vector=vector;
	}

	public Object next() {
		if(hasNext()) {
			Object obj=vector.get(cursor);
			cursor++;
			return obj;
		}
		return null;
	}

	public boolean hasNext() {
		if(cursor >= vector.size()) {
			return false;
		}
		return true;
	}

	public void remove() {
		this.vector.remove(cursor);
	}

}
