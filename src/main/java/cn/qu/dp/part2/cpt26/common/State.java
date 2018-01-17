package cn.qu.dp.part2.cpt26.common;

public abstract class State {
	
	protected Context context;
	
	public void setContext(Context context) {
		this.context=context;
	}
	
	public abstract void handle1();
	
	public abstract void handle2();

}
