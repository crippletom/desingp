package cn.qu.dp.part2.cpt17;

public abstract class Decorator extends Component {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component=component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}

}
