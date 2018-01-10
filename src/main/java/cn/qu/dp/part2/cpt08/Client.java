package cn.qu.dp.part2.cpt08;

public class Client {

	public static void main(String[] args) {
		
		Creator creator=new ConcreteCreator();
		
		Product p=creator.createProduct(ConcreteProduct1.class);
		
		p.doSomeThing();
		
		p=creator.createProduct(ConcreteProduct2.class);
		
		p.doSomeThing();
	}

}
