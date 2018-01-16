package cn.qu.dp.part2.cpt24.common;

public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento m) {
		this.setState(m.getState());
	}

}
