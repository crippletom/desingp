package cn.qu.dp.part2.cpt26.sepcial;

public class RunningState extends LiftState {

	@Override
	public void open() {
		//运行状态不能打开
	}

	@Override
	public void close() {
		//运行状态不能关闭
	}

	@Override
	public void run() {
		System.out.println("电梯运行...");
	}

	@Override
	public void stop() {
		this.context.setLiftState(Context.stoppingState);
		this.context.stop();
	}

}
