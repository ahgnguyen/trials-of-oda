import java.util.Arrays;
import java.util.List;

public class Sheep extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Sheep() {
		this.name = "Haros the Sheep";
		this.health = 150;
		this.maxHealth = health;
		wordList = Arrays.asList("shear", "wool", "shepeard", "black", "lamb");
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