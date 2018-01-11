package cn.qu.dp.part2.cpt15.special;

public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("客户找到需求");
	}

	@Override
	public void add() {
		System.out.println("客户要求新增需求");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除需求");
	}

	@Override
	public void change() {
		System.out.println("客户要求改变需求");
	}

	@Override
	public void plan() {
		System.out.println("需求变更计划");
	}

}
