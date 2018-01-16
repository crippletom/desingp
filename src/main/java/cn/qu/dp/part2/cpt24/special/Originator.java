package cn.qu.dp.part2.cpt24.special;

public class Originator implements Cloneable {
	
	//状态
	private String state;
	
	//备份
	private Originator clone;

	@Override
	protected Originator clone() {
		Originator o=null;
		try {
			o=(Originator)super.clone();
			o.clone=null;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	public void createMemento() {
		clone=this.clone();
	}
	
	public void restoreMemento() {
		if(clone!=null) {
			this.state=clone.state;
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
