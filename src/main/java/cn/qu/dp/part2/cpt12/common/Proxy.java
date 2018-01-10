package cn.qu.dp.part2.cpt12.common;

public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy() {
		this.subject=new RealSubject();
	}
	
	//通过构造方法传递被代理者
	public Proxy(Subject... objects) {
		
	}

	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before() {
		System.out.println("proxy before");
	}
	
	private void after() {
		System.out.println("proxy after");
	}

}
