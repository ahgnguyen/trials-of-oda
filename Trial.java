import java.util.Queue;
import java.util.Scanner;

public abstract class Trial {

	public void enterTrial(Player player) {
		initializeTrial();

		while (!getEnemies().isEmpty()) {
			battle(player, getEnemies().remove());
		}

		clearTrial();
	}

	private void battle(Player player, Enemy enemy) {
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

	public abstract Queue<Enemy> getEnemies();

	public abstract void initializeTrial();

	public abstract void clearTrial();
}