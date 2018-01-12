package cn.qu.dp.part2.cpt16;

public abstract class Handler {
	
	private Handler nextHandler;

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public final Response handleMessage(Request request) {
		Response response=null;
		if(request.getLevel()==this.getHandlerLevel()) {
			response=this.echo(request);
		}else {
			if(this.nextHandler!=null) {
				response=this.nextHandler.handleMessage(request);
			}else {
				//没有适当的处理者，业务自行处理
			}
		}
		return response;
	}
	
	//每个处理者都必须实现的处理任务
	protected abstract Response echo(Request request);
	//当前处理者的级别
	protected abstract Level getHandlerLevel();

}
