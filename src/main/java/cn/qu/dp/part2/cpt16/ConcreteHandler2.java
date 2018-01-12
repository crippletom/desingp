package cn.qu.dp.part2.cpt16;

public class ConcreteHandler2 extends Handler {

	@Override
	protected Response echo(Request request) {
		
		//实现当前处理者的处理逻辑...
		System.out.println("这是处理者2的处理方法");
		
		return new Response(request.getLevel().toString());
	}

	@Override
	protected Level getHandlerLevel() {
		return Level.LEVEL2;
	}

}
