public class Blizzard extends Spell {

	private String name;
	private int difficulty;

	public Blizzard() {
		this.name = "Blizzard";
		this.difficulty = 4;
	}

	public void attack(Enemy enemy, double wordsPerMin) {
		if (wordsPerMin >= 70) {
			System.out.println(enemy.getName() + " was frozen.");
		}

		int damage = 10;
		System.out.println(enemy.getName() + " was hit for " + damage + ".");
		enemy.setHealth(enemy.getHealth() - damage);
	}

	public String getName() {
		return name;
	}

	public int getDifficulty() {
		return difficulty;
	}
}