package cn.qu.dp.part2.cpt28.special;

import java.util.HashMap;
import java.util.Map;

public class SignInfoFactory {
	
	private static Map<String,SignInfo4Pool> pool = new HashMap<String,SignInfo4Pool>();
	
	public static SignInfo getSignInfo(String key) {
		if(pool.containsKey(key)) {
			System.out.println("从对象池中获取："+key);
			return pool.get(key);
		}else {
			System.out.println("新建对象并放入对象池："+key);
			SignInfo4Pool si=new SignInfo4Pool();
			si.setKey(key);
			pool.put(key, si);
			return si;
		}
	}

}
