package cn.qu.dp.part2.cpt20;

public class Client {

	public static void main(String[] args) {
		
		Aggregate data=new ConcreteAggregate();
		data.add(new Object());
		data.add(new Object());
		data.add(new Object());
		data.add(new Object());
		data.add(new Object());
		
		Iterator it=data.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
