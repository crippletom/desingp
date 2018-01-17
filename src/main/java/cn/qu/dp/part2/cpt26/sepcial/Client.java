package cn.qu.dp.part2.cpt26.sepcial;

public class Client {
	
	public static void main(String[] args) {
		
		Context context=new Context();
		
		context.setLiftState(Context.openningState);
		
		context.close();
		
		context.run();
		
		context.open();//运行状态下，看能不能打开门
		
		context.stop();
		
		context.open();
	}

}
