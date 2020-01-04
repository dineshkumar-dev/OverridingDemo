
class Player {

	IPlayer player;
	public Player(IPlayer player) {

		this.player=player;
		
	}

	public void PlayerPlay() {	
		
		this.player.play();
	}

}

interface IPlayer{
	void play();
	
}
class Allrounder implements IPlayer{
	public void play() {
		System.out.println("Allrounder can do all these:");
		System.out.println("player can bowl,bat and field");
	}

}

class Batsman implements IPlayer {
	public void play() {
		System.out.println("batsman do these");
		System.out.println("player can bat only");
	}

}

class Bowler implements IPlayer{
	public void play() {
		System.out.println("bowler do these");
		System.out.println("player can bowl only");
	}
}


public class Method4 {

	public static void main(String[] args) {

		
		Allrounder al = new Allrounder();
		Player p1 = new Player(al);
		p1.PlayerPlay();
		
		Batsman bt = new Batsman();
		Player p2 = new Player(bt);
		p2.PlayerPlay();
		
		Bowler bow = new Bowler();
		Player p3 = new Player(bow);
		p3.PlayerPlay();

	}

}