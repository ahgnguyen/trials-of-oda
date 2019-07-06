import java.util.Arrays;
import java.util.List;

public class Rooster extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Rooster() {
		this.name = "Carolina the Rooster";
		this.health = 250;
		this.maxHealth = health;
		wordList = Arrays.asList("chicken", "crow", "egg", "farm", "bird", "hen");
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