package cn.qu.dp.part2.cpt21;

public class Client {

	public static void main(String[] args) {
		//创建一个根节点
		Composite root=new Composite();
		//创建一个树枝
		Composite branch=new Composite();
		branch.add(new Leaf());
		branch.add(new Leaf());
		Composite branch2=new Composite();
		branch2.add(new Leaf());
		branch2.add(new Leaf());
		branch2.add(new Leaf());
		
		root.add(branch);
		root.add(branch2);
		//树叶
		Leaf leaf=new Leaf();
		
		root.add(leaf);
		
		display(root,"-");
	}
	
	public static void display(Component component,String intent) {
		System.out.println(intent+":"+component.doSomething());
		if(component instanceof Composite) {
			Composite c=(Composite)component;
			for(Component comp:c.getChildren()) {
				display(comp,intent+"-");
			}
		}
	}

}
