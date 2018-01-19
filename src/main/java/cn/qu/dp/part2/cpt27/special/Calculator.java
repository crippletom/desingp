package cn.qu.dp.part2.cpt27.special;

import java.util.Map;
import java.util.Stack;

public class Calculator {

	private Expression expression;
	
	public Calculator(String expStr) {
		Stack<Expression> stacks=new Stack<Expression>();
		char[] charArray=expStr.toCharArray();
		
		Expression left;
		Expression right;
		for(int i=0;i<charArray.length;i++) {
			switch(charArray[i]) {
			case '+':
				left=stacks.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stacks.push(new AddExpression(left,right));
				break;
			case '-':
				left=stacks.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stacks.push(new SubExpression(left,right));
				break;
			default:
				stacks.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		expression=stacks.pop();
	}
	
	public int run(Map<String,Integer> var) {
		return this.expression.interpreter(var);
	}
}
