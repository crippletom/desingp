package cn.qu.dp.part2.cpt10;

public class Client {

	public static void main(String[] args) {
		
		AbstractClass ac=new ConcreteClass();
		
		//ac.setHook(false);
		ac.templateMethod();
	}

}
