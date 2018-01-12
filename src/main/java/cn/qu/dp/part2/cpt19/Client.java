package cn.qu.dp.part2.cpt19;

public class Client {

	public static void main(String[] args) {
		//原有的业务逻辑
		Target target=new ConcreteTarget();
		target.request();
		
		//使用了适配器的业务逻辑
		target = new Adapter();
		target.request();
	}
}
