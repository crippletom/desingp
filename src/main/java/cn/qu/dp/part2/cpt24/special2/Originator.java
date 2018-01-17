package cn.qu.dp.part2.cpt24.special2;

import java.util.HashMap;
import java.util.Map;

public class Originator {
	
	@Override
	public String toString() {
		return "Originator [state1=" + state1 + ", state2=" + state2 + ", state3=" + state3 + "]";
	}

	private String state1;
	private String state2;
	private String state3;
	
	public String getState1() {
		return state1;
	}
	public void setState1(String state1) {
		this.state1 = state1;
	}
	public String getState2() {
		return state2;
	}
	public void setState2(String state2) {
		this.state2 = state2;
	}
	public String getState3() {
		return state3;
	}
	public void setState3(String state3) {
		this.state3 = state3;
	}
	
	public IMemento createMemento() {
		Memento memento=new Memento();
		memento.setStateMap(BeanUtils.backupProp(this));
		return memento;
	}
	
	public void restoreMemento(IMemento memento) {
		BeanUtils.restoreProp(this, ((Memento)memento).getStateMap());
	}
	
	private class Memento implements IMemento{
		
		private Map<String,Object> stateMap=new HashMap<String,Object>();

		private Map<String, Object> getStateMap() {
			return stateMap;
		}

		private void setStateMap(Map<String, Object> stateMap) {
			this.stateMap = stateMap;
		}
		
	}
	
}
