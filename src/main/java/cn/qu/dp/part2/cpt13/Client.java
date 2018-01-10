package cn.qu.dp.part2.cpt13;

public class Client {

	public static void main(String[] args) {
		
		PrototypeClass pc = new PrototypeClass("xxx");
		
		System.out.println(pc.getName());
		
		PrototypeClass pc2=pc.clone();
		
		System.out.println(pc2.getName());
	}

}
