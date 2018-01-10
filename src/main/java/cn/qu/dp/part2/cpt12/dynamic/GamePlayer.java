package cn.qu.dp.part2.cpt12.dynamic;

public class GamePlayer implements IGamePlayer {

	public void login(String username, String passwd) {
		System.out.println(String.format("gameplayer login , username:%s passwd:%s",username,passwd));
	}

	public void killBoss() {
		System.out.println("gameplayer killBoss");
	}

	public void upGrade() {
		System.out.println("gameplayer upGrade");
	}

}
