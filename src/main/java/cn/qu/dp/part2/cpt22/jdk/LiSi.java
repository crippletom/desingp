package cn.qu.dp.part2.cpt22.jdk;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

	public void update(Observable o, Object arg) {
		reportToQSH(arg.toString());
	}
	
	private void reportToQSH(String reportContext) {
		System.out.println("李斯：报告秦始皇，韩非子有活动了---->"+reportContext);
	}

}
