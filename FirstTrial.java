import java.util.Queue;
import java.util.LinkedList;

public class FirstTrial extends Trial {

	private Queue<Enemy> enemies;

	public FirstTrial() {
		this.enemies = new LinkedList<Enemy>();

		this.enemies.add(new Rooster());
		this.enemies.add(new Dog());
		this.enemies.add(new Pig());
	}

	public Queue<Enemy> getEnemies() {
		return enemies;
	}

	public void initializeTrial() {
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
		System.out.println("Begin Trial #1");
		System.out.println("===========================");
	}

	public void clearTrial() {
		System.out.println("You have cleared Trial #1!");
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
	}
}