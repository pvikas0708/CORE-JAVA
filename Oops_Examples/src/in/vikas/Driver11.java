package in.vikas;

public class Driver11 {

	public static void main(String[] args) {
		Driver11 d = new Driver11();
		Player1 player = d.getPlayer(18);

		System.out.println(player.id + " " + player.name + " " + player.age);

	}

	Player1 getPlayer(int id) {
		Player1 p = new Player1();
		if (id == 7) {
			p.id = 7;
			p.name = "Dhoni";
			p.age = 35;
		} else if (id == 18) {
			p.id = 18;
			p.name = "Kohli";
			p.age = 30;
		} else if (id == 45) {
			p.id = 45;
			p.name = "Rohit";
			p.age = 32;
		}
		return p;
	}
}

class Player1 {
	int id;
	String name;
	int age;

}
//Output:18 Kohli 30
