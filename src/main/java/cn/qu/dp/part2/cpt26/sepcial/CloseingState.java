package cn.qu.dp.part2.cpt26.sepcial;

public class CloseingState extends LiftState {

	@Override
	public void open() {
		this.context.setLiftState(Context.openningState);
		this.context.open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		this.context.setLiftState(Context.runningState);
		this.context.run();
	}

	@Override
	public void stop() {
		// 关闭状态不能停止

	}

}
