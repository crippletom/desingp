package cn.qu.dp.part2.cpt29;

public class Client {

	public static void main(String[] args) {
		
		Implementor imp=new ConcreteImplementor1();
		
		Abstraction abs=new RefinedAbstraction(imp);
		
		abs.request();
	}

}
