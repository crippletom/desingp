package cn.qu.dp.part2.cpt15.special;

public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		//找到美工
		super.pg.find();
		//
		super.rg.delete();
		//
		super.rg.plan();
	}

}
