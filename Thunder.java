public class Thunder extends Spell {

	private String name;
	private int difficulty;

	public Thunder() {
		this.name = "Thunder";
		this.difficulty = 5;
	}

	public void attack(Enemy enemy, double wordsPerMin) {
		int damage = (int) wordsPerMin;

		System.out.println(enemy.getName() + " was struck for " + damage + ".");
		enemy.setHealth(enemy.getHealth() - damage);
	}

	public String getName() {
		return name;
	}

	public int getDifficulty() {
		return difficulty;
	}
}