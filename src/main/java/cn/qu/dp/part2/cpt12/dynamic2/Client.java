package cn.qu.dp.part2.cpt12.dynamic2;

import cn.qu.dp.part2.cpt12.dynamic2.invocationhandler.MyInvocationHandler;

public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		
		Subject proxy = (Subject)DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), 
				new MyInvocationHandler(subject));
		
		proxy.doSomething("hello");
	}
	
}
