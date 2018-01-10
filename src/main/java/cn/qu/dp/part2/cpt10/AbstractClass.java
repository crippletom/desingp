package cn.qu.dp.part2.cpt10;

public abstract class AbstractClass {
	
	private boolean hook=true;
	
	/**
	 * 基本方法
	 */
	protected abstract void doSomeThing();
	/**
	 * 基本方法
	 */
	protected abstract void doAnyThing();
	/**
	 * 钩子方法
	 * @param hook
	 */
	public void setHook(boolean hook) {
		this.hook = hook;
	}
	/**
	 * 模板方法
	 */
	public final void templateMethod() {
		this.doAnyThing();
		if(hook) {
			this.doSomeThing();
		}
	}

}
