package cn.qu.dp.part2.cpt27.common;

import java.util.Stack;

public class Client {
	
	public static void main(String[] args) {
		Context ctx=new Context();
		
		//语法容器
		Stack<AbstractExpression> stack=new Stack<AbstractExpression>();
		
		//for(;;) {
			//进行语法判断，并产生递归调用
		//}
		
		//产生完整的语法树，由各个具体的语法分析解析
		AbstractExpression expression=stack.pop();
		
		//解析
		expression.interpreter(ctx);
	}

}
