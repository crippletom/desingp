package cn.qu.dp.part2.cpt22.jdk;

import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {

	public void haveBreakfast() {
		System.out.println("韩非子：吃早饭了...");
		super.setChanged();
		super.notifyObservers("韩非子在吃饭。");
	}

	public void haveFun() {
		System.out.println("韩非子：开始娱乐...");
		super.setChanged();
		super.notifyObservers("韩非子在娱乐。");
	}

}
