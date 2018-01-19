package cn.qu.dp.part2.cpt27.common;

public class NonterminalExpression extends AbstractExpression {
	
	//每个非终结者表达式都会对其他表达式产生依赖
	public NonterminalExpression(AbstractExpression... expressions) {
		
	}

	@Override
	public Object interpreter(Context context) {
		// 文法处理
		return null;
	}

}
