package in.vikas;

public class Driver6 {

	public static void main(String[] args) {

		Driver6 d = new Driver6();

		Player p = new Player();
		p.playerId = 101;
		p.playerName = "vikas";
		p.playerAge = 30;

		d.print(p);

	}

	void print(Player p) {
		System.out.println(p.playerId + " " + p.playerName + " " + p.playerAge);
	}
}

class Player {
	int playerId;
	String playerName;
	int playerAge;
}
//Output:101 vikas 30
