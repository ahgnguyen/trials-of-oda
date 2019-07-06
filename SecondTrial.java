import java.util.Queue;
import java.util.LinkedList;

public class SecondTrial extends Trial {

	private Queue<Enemy> enemies;

	public SecondTrial() {
		this.enemies = new LinkedList<Enemy>();

		this.enemies.add(new Horse());
		this.enemies.add(new Sheep());
		this.enemies.add(new Monkey());
	}

	public Queue<Enemy> getEnemies() {
		return enemies;
	}

	public void initializeTrial() {
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
		System.out.println("Begin Trial #2");
		System.out.println("===========================");
	}

	public void clearTrial() {
		System.out.println("You have cleared Trial #2!");
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
	}
}