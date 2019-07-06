import java.util.Arrays;
import java.util.List;

public class Rabbit extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Rabbit() {
		this.name = "Torrac the Rabbit";
		this.health = 150;
		this.maxHealth = health;
		wordList = Arrays.asList("jump", "carrot", "hare", "fluffy", "bunny");
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