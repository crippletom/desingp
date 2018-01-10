package cn.qu.dp.part2.cpt11.special;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("这是BMWModel.start");
	}

	@Override
	protected void stop() {
		System.out.println("这是BMWModel.stop");
	}

	@Override
	protected void alerm() {
		System.out.println("这是BMWModel.alerm");
	}

	@Override
	protected void engineBoom() {
		System.out.println("这是BMWModel.engineBoom");
	}

}
