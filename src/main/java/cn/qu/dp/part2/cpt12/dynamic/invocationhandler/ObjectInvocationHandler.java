package cn.qu.dp.part2.cpt12.dynamic.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectInvocationHandler implements InvocationHandler {
	
	//被代理对象
	private Object obj;
	
	public ObjectInvocationHandler(Object _obj) {
		this.obj=_obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ObjectInvocationHandler before");
		Object ret = method.invoke(obj, args);
		System.out.println("ObjectInvocationHandler after");
		return ret;
	}

}
