package cn.qu.dp.part2.cpt20;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
	
	private Vector<Object> vector=new Vector<Object>();

	public void add(Object obj) {
		vector.add(obj);
	}

	public Iterator iterator() {
		return new ConcreteIterator(vector);
	}

}
