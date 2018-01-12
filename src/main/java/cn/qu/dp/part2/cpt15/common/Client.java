package cn.qu.dp.part2.cpt15.common;

public class Client {

	public static void main(String[] args) {
		
		//首先声明调用者
		Invoker invoker=new Invoker();
		
		//接收者
		Receiver receiver=new ConcreteReceiver1();
		
		//定义一个发送给接收者的命令
		Command command=new ConcreteCommand1(receiver);
		
		//把命令交给调用者执行
		invoker.setCommand(command);
		invoker.action();
	}
	
}
