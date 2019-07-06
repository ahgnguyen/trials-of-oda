import java.util.Arrays;
import java.util.List;

public class Dog extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Dog() {
		this.name = "Washington the Dog";
		this.health = 250;
		this.maxHealth = health;
		this.wordList = Arrays.asList("bark", "corgi", "husky", "bone", "fetch");
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