package cn.qu.dp.part2.cpt07;

public class Client {

	public static void main(String[] args) {
		
		Singleton s1=Singleton.getSingleton();
		Singleton s2=Singleton.getSingleton();
		
		System.out.println(s1==s2);
	}

}
