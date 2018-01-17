package cn.qu.dp.part2.cpt26.sepcial;

public class StoppingState extends LiftState {

	@Override
	public void open() {
		this.context.setLiftState(Context.openningState);
		this.context.open();
	}

	@Override
	public void close() {
		//
	}

	@Override
	public void run() {
		this.context.setLiftState(Context.runningState);
		this.context.run();
	}

	@Override
	public void stop() {
		System.out.println("电梯停止...");
	}

}
