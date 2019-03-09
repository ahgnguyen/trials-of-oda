import java.util.Scanner;
import java.lang.Math;

public class Game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String playerName = in.nextLine();

		System.out.println("Wake up " + playerName + ". Welcome to Oda.");
		System.out.println("===========");

		Player player = new Player(playerName);
		player.addSpell(new Fire());
		player.addSpell(new Blizzard());
		player.addSpell(new Thunder());

		Enemy rat = new Rat();
		Enemy ox = new Ox();
		Enemy tiger = new Tiger();

		battle(player, rat);
		battle(player, ox);
		battle(player, tiger);
	}

	private static void battle(Player player, Enemy enemy) {
		Scanner in = new Scanner(System.in);
		boolean inBattle = true;
		while (inBattle) {

			enemy.printBattleStatus(); // print enemy information
			player.printBattleOptions();  // print players options

			// get user input
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
}