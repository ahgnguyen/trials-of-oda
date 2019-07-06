import java.util.Arrays;
import java.util.List;

public class Monkey extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Monkey() {
		this.name = "Meape the Monkey";
		this.health = 200;
		this.maxHealth = health;
		this.wordList = Arrays.asList("banana", "baboon", "primate", "leap", "forest");
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