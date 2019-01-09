import java.util.Random;
import java.util.List;
import java.util.Scanner;

public abstract class Spell {

	public void cast(Enemy enemy) {
		Scanner in = new Scanner(System.in);

		System.out.println("You casted " + this.getName() + ".");

		String incantation = this.generateIncantation(enemy.getWordList());
		System.out.println(incantation);

		long startTime = System.nanoTime();
		String userIncantation = in.nextLine();
		long elapsed = System.nanoTime() - startTime;

		if (userIncantation.equals(incantation)) {
			double minElapsed = (elapsed / (6 * Math.pow(10, 10)));
			double wordsPerMin = getDifficulty() / minElapsed;
			
			System.out.println("WPM: " + wordsPerMin);	
			attack(enemy, wordsPerMin);
		} else {
			System.out.println("It missed...");
		}
	}

	private String generateIncantation(List<String> dictionary) {
		Random rand = new Random();

		String incantation = "";
		for (int i = 0; i < getDifficulty(); i++) {
			int randIndex = rand.nextInt(dictionary.size());
			String randWord = dictionary.get(randIndex);
			incantation += randWord + " ";
		}
 
		return incantation.trim();
	}

	public abstract void attack(Enemy enemy, double wordsPerMin);

	public abstract String getName();

	public abstract int getDifficulty();
}