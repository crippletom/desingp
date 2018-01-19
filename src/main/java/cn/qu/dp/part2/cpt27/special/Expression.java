package cn.qu.dp.part2.cpt27.special;

import java.util.Map;

public abstract class Expression {
	
	/**
	 * 解析公式和数值，其中var中的key表示公式中的参数，value表示公式中参数对应的数字
	 * @param var
	 * @return
	 */
	public abstract int interpreter(Map<String,Integer> var);

}
