import java.util.Scanner;
import java.lang.Math;

public class Game {
	public static void main(String[] args) {

		Player player = intializePlayer();

		player.addSpell(new Fire());
		player.addSpell(new Blizzard());
		player.addSpell(new Thunder());

		enterTrials(player);

		// end game stats
	}

	private static Player intializePlayer() {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String playerName = in.nextLine();

		System.out.println("Wake up " + playerName + ". Welcome to Oda.");

		return new Player(playerName);
	}

	private static void enterTrials(Player player) {
		Trial firstTrial = new FirstTrial();
		firstTrial.enterTrial(player);

		Trial secondTrial = new SecondTrial();
		secondTrial.enterTrial(player);

		Trial thirdTrial = new ThirdTrial();
		thirdTrial.enterTrial(player);

		Trial fourthTrial = new FourthTrial();
		fourthTrial.enterTrial(player);
	}
}