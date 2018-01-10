package cn.qu.dp.part2.cpt08;

/**
 * 抽象产品
 * @author quqiang
 *
 */
public abstract class Product {

	public void m() {
		System.out.println("公用方法");
	}
	
	public abstract void doSomeThing() ;
}
