package cn.qu.dp.part2.cpt15.special;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("客户找到代码组");
	}

	@Override
	public void add() {
		System.out.println("客户要求新增一项功能");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一项功能");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一项功能");
	}

	@Override
	public void plan() {
		System.out.println("客户要求代码组变更计划");
	}

}
