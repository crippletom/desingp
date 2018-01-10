package cn.qu.dp.part2.cpt11.common;

public class ConcreteBuilder extends Builder {
	
	private Product product=new Product();

	@Override
	public void setPart() {
		/**
		 * 实现组装
		 */

	}

	@Override
	public Product buildProduct() {
		
		
		return product;
	}

}
