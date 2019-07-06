import java.util.Arrays;
import java.util.List;

public class Pig extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Pig() {
		this.name = "Arkansas the Pig";
		this.health = 250;
		this.maxHealth = health;
		wordList = Arrays.asList("pork", "oink", "pink", "boar", "guinea", "swine", "razorback");
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