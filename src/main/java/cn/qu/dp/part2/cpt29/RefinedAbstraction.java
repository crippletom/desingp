package cn.qu.dp.part2.cpt29;

public class RefinedAbstraction extends Abstraction {
	
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	//修正父类的行为
	@Override
	public void request() {
		/**
		 * 业务处理
		 */
		super.request();
		this.getImp().doAnything();
	}
	
}
