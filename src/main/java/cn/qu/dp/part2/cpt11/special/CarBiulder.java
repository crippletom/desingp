package cn.qu.dp.part2.cpt11.special;

import java.util.ArrayList;
import java.util.List;

public abstract class CarBiulder {
	
	private List<String> sequence=new ArrayList<String>();
	
	public final void setSequence(List<String> sequence) {
		this.sequence=sequence;
	}
	
	public final List<String> getSequence(){
		return this.sequence;
	}
	
	public abstract CarModel getCarModel();

}
