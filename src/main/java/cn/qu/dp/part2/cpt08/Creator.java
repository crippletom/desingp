package cn.qu.dp.part2.cpt08;

/**
 * 抽象工厂
 * @author quqiang
 *
 */
public abstract class Creator {

	public abstract <T extends Product> T createProduct(Class<T> claz);
	
}
