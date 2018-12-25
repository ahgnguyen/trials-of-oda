import java.util.Random;
import java.util.List;
import java.util.Scanner;

public class Spell {
	private String name;
	private int difficulty =  3;

	public Spell(String name) {
		this.name = name;
	}

	public void attack(Enemy enemy) {
		Scanner in = new Scanner(System.in);

		System.out.println("You casted " + this.getName() + ".");

		String incantation = this.getIncantation(enemy.getWordList());
		System.out.println(incantation);

		long startTime = System.nanoTime();
		String userIncantation = in.nextLine();
		long elapsed = System.nanoTime() - startTime;

		if (userIncantation.equals(incantation)) {
			int damage = getDamage(elapsed);
			
			System.out.println(enemy.getName() + " was hit for " + damage + ".");
			enemy.setHealth(enemy.getHealth() - damage);
		} else {
			System.out.println("It missed...");
		}
	}

	private int getDamage(long nanoElapsed) {
		double minElapsed = (nanoElapsed / (6 * Math.pow(10, 10)));
		double wordsPerMin = difficulty / minElapsed;
		double speedMultiplier = Math.min(1, wordsPerMin / 100);

		System.out.println("WPM: " + wordsPerMin);
		
		// return (int) Math.round(constant * speedMultiplier + baseDamage);
		return (int) Math.round(40 * speedMultiplier + 10);
	}

	public String getIncantation(List<String> dictionary) {
		Random rand = new Random();

		String incantation = "";
		for (int i = 0; i < difficulty; i++) {
			int randIndex = rand.nextInt(dictionary.size());
			String randWord = dictionary.get(randIndex);
			incantation += randWord + " ";
		}
 
		return incantation.trim();
	}

	public String getName() {
		return name;
	}
}