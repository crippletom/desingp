package cn.qu.dp.part2.cpt27.special;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) throws IOException{
		String expStr=getExpStr();
		Calculator cal=new Calculator(expStr);
		Map<String,Integer> var=getValue(expStr);
		
		System.out.println(expStr+"="+cal.run(var));
	}
	
	public static String getExpStr() throws IOException{
		System.out.println("请输入表达式：");
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	
	public static Map<String,Integer> getValue(String expStr) throws IOException{
		Map<String,Integer> var=new HashMap<String,Integer>();
		char[] charArray=expStr.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			String key=String.valueOf(charArray[i]);
			if(!var.containsKey(key)) {
				if(!"+".equals(key) && !"-".equals(key)) {
					System.out.println("请输入"+key+":");
					String value=new BufferedReader(new InputStreamReader(System.in)).readLine();
					var.put(key, Integer.parseInt(value));
				}
				
			}
		}
		return var;
	}

}
