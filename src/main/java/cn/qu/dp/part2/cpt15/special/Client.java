package cn.qu.dp.part2.cpt15.special;

public class Client {

	public static void main(String[] args) {
		
		Invoker invoker=new Invoker();
		
		Command command=new DeletePageCommand();
		
		invoker.setCommand(command);
		
		invoker.action();
	}

}
