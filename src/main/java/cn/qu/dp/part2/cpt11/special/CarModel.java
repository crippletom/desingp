package cn.qu.dp.part2.cpt11.special;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alerm();
	
	protected abstract void engineBoom();
	
	private List<String> sequence=new ArrayList<String>();
	
	public final void setSequence(List<String> sequence) {
		this.sequence=sequence;
	}
	
	public final void run() {
		for(String actionName:sequence) {
			if("start".equals(actionName)) {
				this.start();
			}else if ("stop".equals(actionName)) {
				this.stop();
			}else if ("alerm".equals(actionName)) {
				this.alerm();
			}else if ("engineBoom".equals(actionName)) {
				this.engineBoom();
			}
		}
	}
}
