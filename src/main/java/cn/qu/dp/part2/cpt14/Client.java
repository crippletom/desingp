package cn.qu.dp.part2.cpt14;

public class Client {

	public static void main(String[] args) {
		
		Mediator mediator=new ConcreteMediator();
		
		ConcreteColleague1 c1=new ConcreteColleague1(mediator);
		ConcreteColleague2 c2=new ConcreteColleague2(mediator);
		
		mediator.setColleague1(c1);
		mediator.setColleague2(c2);
		
		c1.depMethod1();
	}
}
