import java.util.Arrays;
import java.util.List;

public class Enemy {
	private String name;
	private int maxHealth;
	private int health;
	private List<String> wordList;


	public Enemy(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		health = maxHealth;
		wordList = Arrays.asList("fly", "black", "murder", "bird", "wing");
	}

	public void printBattleStatus() {
		System.out.println("Enemy: " + name);
		System.out.println("HP: " + health + "/" + maxHealth);
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public List<String> getWordList() {
		return wordList;
	}
}