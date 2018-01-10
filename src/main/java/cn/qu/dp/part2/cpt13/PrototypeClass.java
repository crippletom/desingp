package cn.qu.dp.part2.cpt13;

import java.util.ArrayList;

public class PrototypeClass implements Cloneable {
	
	private String name;
	
	private ArrayList<String> list=new ArrayList<String>();
	
	public String getName() {
		return name;
	}

	public PrototypeClass(String name) {
		this.name=name;
	}

	@Override
	protected PrototypeClass clone() {
		PrototypeClass pc=null;
		try {
			pc = (PrototypeClass)super.clone();
			//深拷贝
			pc.list = (ArrayList)this.list.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pc;
	}

}
