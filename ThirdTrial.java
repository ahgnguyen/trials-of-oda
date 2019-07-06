import java.util.Queue;
import java.util.LinkedList;

public class ThirdTrial extends Trial {

	private Queue<Enemy> enemies;

	public ThirdTrial() {
		this.enemies = new LinkedList<Enemy>();

		this.enemies.add(new Rabbit());
		this.enemies.add(new Dragon());
		this.enemies.add(new Snake());
	}

	public Queue<Enemy> getEnemies() {
		return enemies;
	}

	public void initializeTrial() {
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
		System.out.println("Begin Trial #3");
		System.out.println("===========================");
	}

	public void clearTrial() {
		System.out.println("You have cleared Trial #3!");
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
	}
}