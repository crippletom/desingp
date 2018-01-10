package cn.qu.dp.part2.cpt12.dynamic;

import java.lang.reflect.Proxy;

import cn.qu.dp.part2.cpt12.dynamic.invocationhandler.ObjectInvocationHandler;

public class Client {

	public static void main(String[] args) {
		
		IGamePlayer player=new GamePlayer();
		
		ObjectInvocationHandler ih=new ObjectInvocationHandler(player);
		
		ClassLoader cl = player.getClass().getClassLoader();
		
		IGamePlayer proxy=(IGamePlayer)Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, ih);
		
		proxy.login("zhangsan", "12345");
		
		proxy.killBoss();
		
		//-----------------------
		
//		IBusiness buz=new Business();
//		
//		ObjectInvocationHandler ih2=new ObjectInvocationHandler(buz);
//		
//		ClassLoader cl2 = buz.getClass().getClassLoader();
//		
//		IBusiness proxy2 = (IBusiness)Proxy.newProxyInstance(cl2, new Class[] {IBusiness.class}, ih2);
//		
//		proxy2.doBusiness1();
		
	}

}
