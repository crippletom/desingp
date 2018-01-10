package cn.qu.dp.part2.cpt08;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> claz) {
		
		T product=null;
		try {
			product=(T)Class.forName(claz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
