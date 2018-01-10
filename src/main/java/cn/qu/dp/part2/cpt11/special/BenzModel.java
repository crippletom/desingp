package cn.qu.dp.part2.cpt11.special;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("这是BenzModel.start");
	}

	@Override
	protected void stop() {
		System.out.println("这是BenzModel.stop");
	}

	@Override
	protected void alerm() {
		System.out.println("这是BenzModel.alerm");
	}

	@Override
	protected void engineBoom() {
		System.out.println("这是BenzModel.engineBoom");
	}

}
