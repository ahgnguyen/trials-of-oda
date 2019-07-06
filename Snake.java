import java.util.Arrays;
import java.util.List;

public class Snake extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Snake() {
		this.name = "Ibeh the Snake";
		this.health = 200;
		this.maxHealth = health;
		wordList = Arrays.asList("slither", "hiss", "", "", "");
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