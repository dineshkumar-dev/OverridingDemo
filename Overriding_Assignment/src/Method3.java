 abstract class Sports {

	public void noOfPlayers(){
		System.out.println("11 players");
	}	
	public void award(){
		System.out.println("trophy for winners");
	}
	
	public abstract void game();
	public abstract void weatherInWhichWeCanPlay();
}

 class Football extends Sports {

	@Override
	public
	void game() {
		
		System.out.println("Football");
	}

	@Override
	public void weatherInWhichWeCanPlay() {
		System.out.println("can play in all weather");
		
	}
	
}

 class Cricket extends Sports{
	
	@Override
	public
	void game() {
		System.out.println("Cricket");		
	}

	@Override
	public void weatherInWhichWeCanPlay() {
		System.out.println("can't play during rain");
		
	}

}

public class Method3 {

	
	public static void main(String[] args) {
		

		System.out.println("For Football");
		Football sptFoot = new Football();
		sptFoot.noOfPlayers();
		sptFoot.award();
		sptFoot.game();
		sptFoot.weatherInWhichWeCanPlay();
		
		System.out.println("- - - - - - - -  -- - ----");
		System.out.println("For Cricket");
		Cricket sptCri = new Cricket();
		sptCri.noOfPlayers();
		sptCri.award();
		sptCri.game();
		sptCri.weatherInWhichWeCanPlay();
	}

}
