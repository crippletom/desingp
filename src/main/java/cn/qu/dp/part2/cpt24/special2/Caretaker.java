package cn.qu.dp.part2.cpt24.special2;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

	private Map<String,IMemento> memMap=new HashMap<String,IMemento>();
	
	public void setIMemento(String idx,IMemento mem) {
		this.memMap.put(idx, mem);
	}
	
	public IMemento getIMemento(String idx) {
		return this.memMap.get(idx);
	}
	
}
