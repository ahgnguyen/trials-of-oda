public class Fire extends Spell {

	private String name;
	private int difficulty;

	public Fire() {
		this.name = "Fire";
		this.difficulty = 3;
	}

	public void attack(Enemy enemy, double wordsPerMin) {
		int damage = (int) (50 * Math.min(1, wordsPerMin / 100) + 20);

		System.out.println(enemy.getName() + " was blasted for " + damage + ".");
		enemy.setHealth(enemy.getHealth() - damage);
	}

	public String getName() {
		return name;
	}

	public int getDifficulty() {
		return difficulty;
	}
}