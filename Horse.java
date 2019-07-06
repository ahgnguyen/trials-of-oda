import java.util.Arrays;
import java.util.List;

public class Horse extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Horse() {
		this.name = "Idash the Horse";
		this.health = 250;
		this.maxHealth = health;
		wordList = Arrays.asList("gallop", "stampede", "pony", "bronco", "ride");
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