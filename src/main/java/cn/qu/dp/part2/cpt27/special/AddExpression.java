package cn.qu.dp.part2.cpt27.special;

import java.util.Map;

public class AddExpression extends SymbolExpression {
	
	public AddExpression(Expression left,Expression right) {
		super(left,right);
	}

	@Override
	public int interpreter(Map<String, Integer> var) {
		return left.interpreter(var)+right.interpreter(var);
	}

}
