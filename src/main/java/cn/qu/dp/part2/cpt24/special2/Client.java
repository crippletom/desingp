package cn.qu.dp.part2.cpt24.special2;

public class Client {

	public static void main(String[] args) {
		/**
		 * 1.多属性
		 * 2.多备份
		 * 3.备份私有访问
		 */
		//创建备忘录
		Caretaker taker=new Caretaker();
		//创建备份发起人
		Originator o=new Originator();
		
		o.setState1("100");
		o.setState2("100");
		o.setState3("100");
		System.out.println(o);
		//备份
		taker.setIMemento("1001", o.createMemento());
		
		o.setState1("200");
		o.setState2("200");
		o.setState3("200");
		System.out.println(o);
		//备份
		taker.setIMemento("1002", o.createMemento());
		
		o.setState1("300");
		o.setState2("300");
		o.setState3("300");
		System.out.println(o);
		//备份
		taker.setIMemento("1003", o.createMemento());
		
		System.out.println("恢复到备份 1002");
		o.restoreMemento(taker.getIMemento("1002"));
		System.out.println(o);
	}
	
}
