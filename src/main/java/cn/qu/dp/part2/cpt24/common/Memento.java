package cn.qu.dp.part2.cpt24.common;

public class Memento {
	
	private String state;
	
	public Memento(String state) {
		this.state=state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
