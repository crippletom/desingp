package cn.qu.dp.part2.cpt24.common;

public class Client {

	public static void main(String[] args) {
		
		//创建发起人
		Originator originator=new Originator();

		// 创建备忘录管理员
		Caretaker caretaker=new Caretaker();
		
		//创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		
		//恢复一个备忘录
		originator.setState(caretaker.getMemento().getState());
	}

}
