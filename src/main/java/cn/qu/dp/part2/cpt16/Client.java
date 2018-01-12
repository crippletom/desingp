package cn.qu.dp.part2.cpt16;

public class Client {

	public static void main(String[] args) {
		
		//组装责任链
		Handler handler1=new ConcreteHandler1();
		Handler handler2=new ConcreteHandler2();
		Handler handler3=new ConcreteHandler3();
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		Request request=new Request(Level.LEVEL3);
		
		//将请求传递给链首
		Response response=handler1.handleMessage(request);
		
		System.out.println(response);
		
	}
	
}
