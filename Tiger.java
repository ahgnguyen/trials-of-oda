import java.util.Arrays;
import java.util.List;

public class Tiger extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Tiger() {
		this.name = "Tiger";
		this.health = 300;
		this.maxHealth = health;
		wordList = Arrays.asList("claws", "stripes", "orange", "hunt", "nimble");
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public List<String> getWordList() {
		return wordList;
	}
}