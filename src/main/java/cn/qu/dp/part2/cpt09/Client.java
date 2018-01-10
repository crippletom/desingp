package cn.qu.dp.part2.cpt09;

public class Client {

	public static void main(String[] args) {
		
		AbstractCreator creator1=new Creator1();
		AbstractProductA pa1=creator1.createProductA();
		AbstractProductB pb1=creator1.createProductB();
		pa1.doSomeThing();
		pb1.doSomeThing();
		
		AbstractCreator creator2=new Creator2();
		AbstractProductA pa2=creator2.createProductA();
		AbstractProductB pb2=creator2.createProductB();
		pa2.doSomeThing();
		pb2.doSomeThing();
		
	}

}
