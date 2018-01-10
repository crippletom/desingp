package cn.qu.dp.part2.cpt11.common;

public class Director {
	
	private Builder builder=new ConcreteBuilder();
	
	public Product getProduct() {
		
		/**
		 * 设置产品零件，产生不同产品
		 */
		builder.setPart();
		
		return builder.buildProduct();
	}

}
