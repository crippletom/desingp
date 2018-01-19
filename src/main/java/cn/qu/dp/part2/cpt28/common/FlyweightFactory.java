package cn.qu.dp.part2.cpt28.common;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private static Map<String,Flyweight> pool=new HashMap<String,Flyweight>();
	
	public static Flyweight getFlyweight(String extrinsic) {
		if(pool.containsKey(extrinsic)) {
			return pool.get(extrinsic);
		}else {
			Flyweight flyweight=new ConcreteFlyweight(extrinsic);
			pool.put(extrinsic, flyweight);
			return flyweight;
		}
	}

}
