package cn.qu.dp.part2.cpt21;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> list=new ArrayList<Component>();

	@Override
	public String doSomething() {
		return "Composite";
	}
	
	public void add(Component component) {
		this.list.add(component);
	}
	
	public void remove(Component component) {
		this.list.remove(component);
	}
	
	public List<Component> getChildren(){
		return this.list;
	}

}
