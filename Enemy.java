import java.util.List;

public abstract class Enemy {

	public void printBattleStatus() {
		System.out.println("Enemy: " + getName());
		System.out.println("HP: " + getHealth() + "/" + getMaxHealth());
	}

	public abstract String getName();

	public abstract int getHealth();

	public abstract int getMaxHealth();

	public abstract void setHealth(int health);

	public abstract List<String> getWordList();
}