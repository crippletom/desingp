package cn.qu.dp.part2.cpt11.special;

public class BMWBuilder extends CarBiulder {

	@Override
	public CarModel getCarModel() {
		CarModel cm=new BMWModel();
		cm.setSequence(this.getSequence());
		return cm;
	}

}
