package cn.qu.dp.part2.cpt28.special;

public class Client {
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				SignInfoFactory.getSignInfo("科目"+i+"场地"+j);
			}
		}
		
		SignInfoFactory.getSignInfo("科目3场地4");
	}

}
