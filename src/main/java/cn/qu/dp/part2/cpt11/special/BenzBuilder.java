package cn.qu.dp.part2.cpt11.special;

public class BenzBuilder extends CarBiulder {

	@Override
	public CarModel getCarModel() {
		CarModel mc=new BenzModel();
		mc.setSequence(this.getSequence());
		return mc;
	}

}
