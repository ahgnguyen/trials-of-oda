import java.util.Arrays;
import java.util.List;

public class Ox extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Ox() {
		this.name = "Ox";
		this.health = 500;
		this.maxHealth = health;
		wordList = Arrays.asList("large", "bull", "horns", "strong", "cattle");
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