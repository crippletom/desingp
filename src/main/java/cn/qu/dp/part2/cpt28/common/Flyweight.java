package cn.qu.dp.part2.cpt28.common;

public abstract class Flyweight {
	
	private String intrinsic;
	
	private final String extrinsic;
	
	public Flyweight(String extrinsic) {
		this.extrinsic=extrinsic;
	}

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

	public String getExtrinsic() {
		return extrinsic;
	}
	
	public abstract void operate();

}
