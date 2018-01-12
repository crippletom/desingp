package cn.qu.dp.part2.cpt15.special;

public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		//找到需求组
		super.rg.find();
		//新增一份需求
		super.rg.add();
		//页面要增加
		super.pg.add();
		//功能要增加
		super.cg.add();
		//给出计划
		super.rg.plan();
	}

}
