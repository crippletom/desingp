package cn.qu.dp.part2.cpt24.special;

public class Client {

	public static void main(String[] args) {
		
		Originator origin=new Originator();
		origin.setState("初始状态...");
		System.out.println(origin.getState());
		
		//创建备份
		origin.createMemento();
		origin.setState("修改...");
		
		System.out.println(origin.getState());
		//恢复
		origin.restoreMemento();
		System.out.println(origin.getState());
	}
	
}
