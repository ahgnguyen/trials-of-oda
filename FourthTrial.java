import java.util.Queue;
import java.util.LinkedList;

public class FourthTrial extends Trial {

	private Queue<Enemy> enemies;

	public FourthTrial() {
		this.enemies = new LinkedList<Enemy>();

		this.enemies.add(new Rat());
		this.enemies.add(new Ox());
		this.enemies.add(new Tiger());
	}

	public Queue<Enemy> getEnemies() {
		return enemies;
	}

	public void initializeTrial() {
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
		System.out.println("Begin Trial #4");
		System.out.println("===========================");
	}

	public void clearTrial() {
		System.out.println("You have cleared Trial #4!");
		System.out.println("===========================");
		System.out.println("Trial Flavor Text");
	}
}