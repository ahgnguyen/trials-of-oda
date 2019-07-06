import java.util.Arrays;
import java.util.List;

public class Dragon extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Dragon() {
		this.name = "Odiak the Dragon";
		this.health = 400;
		this.maxHealth = health;
		this.wordList = Arrays.asList("mythical", "scales", "fire", "drake", "beast");
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