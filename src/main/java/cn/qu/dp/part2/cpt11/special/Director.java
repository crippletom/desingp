package cn.qu.dp.part2.cpt11.special;

import java.util.ArrayList;
import java.util.List;

public class Director {
	
	private List<String> sequence=new ArrayList<String>();
	
	private CarBiulder benzBuilder=new BenzBuilder();
	
	private CarBiulder bmwBuilder=new BMWBuilder();
	
	public CarModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	public CarModel getBBMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("alerm");
		bmwBuilder.setSequence(sequence);
		return bmwBuilder.getCarModel();
	}

}
