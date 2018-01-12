package cn.qu.dp.part2.cpt15.common;

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
}
