package cn.qu.dp.part2.cpt22.jdk;

public class Client {

	public static void main(String[] args) {
		//韩非子为被观察者
		HanFeiZi hfz=new HanFeiZi();
		//李斯是观察者
		LiSi lisi=new LiSi();
		
		hfz.addObserver(lisi);
		
		hfz.haveBreakfast();
		hfz.haveFun();
		
	}

}
