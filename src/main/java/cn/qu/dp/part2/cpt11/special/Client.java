package cn.qu.dp.part2.cpt11.special;

public class Client {

	public static void main(String[] args) {
		Director director=new Director();
		
		director.getABenzModel().run();
		
		director.getBBMWModel().run();
	}

}
