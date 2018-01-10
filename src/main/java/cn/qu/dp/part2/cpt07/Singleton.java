package cn.qu.dp.part2.cpt07;

/**
 * 单例类
 * @author quqiang
 *
 */
public class Singleton {
	
	private static final Singleton single=new Singleton();
	
	/**
	 * 私有的构造方法
	 */
	private Singleton() {}
	
	/**
	 * 只能通过该方法获取单例
	 * @return
	 */
	public static Singleton getSingleton() {
		return single;
	}
	
	/**
	 * 其他方法...
	 */

}
