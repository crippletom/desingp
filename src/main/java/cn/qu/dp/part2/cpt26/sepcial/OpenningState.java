package cn.qu.dp.part2.cpt26.sepcial;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("电梯门打开...");
	}

	@Override
	public void close() {
		this.context.setLiftState(Context.closeingState);
		this.context.close();
	}

	@Override
	public void run() {
		// 打开状态不能运行

	}

	@Override
	public void stop() {
		// 打开状态不能停止

	}

}
