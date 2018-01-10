package cn.qu.dp.part2.cpt12.dynamic2.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object obj;
	
	public MyInvocationHandler(Object _obj) {
		this.obj=_obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(obj, args);
	}

}
