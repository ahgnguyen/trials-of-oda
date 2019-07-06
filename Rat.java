import java.util.Arrays;
import java.util.List;

public class Rat extends Enemy {

	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;

	public Rat() {
		this.name = "Atouille the Rat";
		this.health = 100;
		this.maxHealth = health;
		wordList = Arrays.asList("rodent", "tail", "fur", "lab", "agile", "quick");
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