package cn.qu.dp.part2.cpt26.common;

public class Client {
	
	public static void main(String[] args) {
		
		Context context=new Context();
		
		context.setState(Context.state1);
		
		context.handle1();
		context.handle2();
	}

}
