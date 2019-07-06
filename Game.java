import java.util.Scanner;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String playerName = in.nextLine();

		System.out.println("Wake up " + playerName + ". Welcome to Oda.");
		System.out.println("===========================");

		Player player = new Player(playerName);
		player.addSpell(new Fire());
		player.addSpell(new Blizzard());
		player.addSpell(new Thunder());

		Queue<Enemy> currFloor = new LinkedList<Enemy>();

		enterFloorOne(player, currFloor);
		enterFloorTwo(player, currFloor);
		enterFloorThree(player, currFloor);
		enterFloorFour(player, currFloor);

		// end game stats
	}

	private static void battleFloor(Player player, Queue<Enemy> floor) {

		while (!floor.isEmpty()) {
			battle(player, floor.remove());
		}

		System.out.println("You have cleared the floor!");
		System.out.println("===========================");
	}

	private static void battle(Player player, Enemy enemy) {
		Scanner in = new Scanner(System.in);
		boolean inBattle = true;
		while (inBattle) {

			enemy.printBattleStatus(); // print enemy information
			player.printBattleOptions();  // print player options

			// player action
			int input = in.nextInt();
			in.nextLine();
			Spell usedSpell = player.getSpells().get(input - 1);

			usedSpell.cast(enemy); // perform action

			// check for end of battle
			if (enemy.getHealth() <= 0) {
				inBattle = false;
				System.out.println(enemy.getName() + " has been slain.");
			}

			System.out.println();
		}
	}

	private static void enterFloorOne(Player player, Queue<Enemy> floor) {
		System.out.println("Begin Trial #1");
		System.out.println("===========================");

		floor.add(new Rooster());
		floor.add(new Dog());
		floor.add(new Pig());
		battleFloor(player, floor);
	}

	private static void enterFloorTwo(Player player, Queue<Enemy> floor) {
		System.out.println("Begin Trial #2");
		System.out.println("===========================");

		floor.add(new Horse());
		floor.add(new Sheep());
		floor.add(new Monkey());
		battleFloor(player, floor);		
	}

	private static void enterFloorThree(Player player, Queue<Enemy> floor) {
		System.out.println("Begin Trial #3");
		System.out.println("===========================");

		floor.add(new Rabbit());
		floor.add(new Dragon());
		floor.add(new Snake());
		battleFloor(player, floor);		
	}

	private static void enterFloorFour(Player player, Queue<Enemy> floor) {
		System.out.println("Begin Trial #4");
		System.out.println("===========================");

		floor.add(new Rat());
		floor.add(new Ox());
		floor.add(new Tiger());
		battleFloor(player, floor);
	}


}