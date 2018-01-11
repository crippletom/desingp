package cn.qu.dp.part2.cpt15.special;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("客户找到美工");
	}

	@Override
	public void add() {
		System.out.println("客户要求新增页面");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除页面");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改页面");
	}

	@Override
	public void plan() {
		System.out.println("页面变更计划");
	}

}
