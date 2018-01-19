package cn.qu.dp.part2.cpt28.common;

public class Client {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			FlyweightFactory.getFlyweight("extrinsic"+i);
		}
		
		FlyweightFactory.getFlyweight("extrinsic5");
	}

}
