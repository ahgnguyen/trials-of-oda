import java.util.List;
import java.util.ArrayList;

public class Player {
	private String name;
	private List<Spell> spells;

	public Player(String name) {
		this.name = name;
		spells = new ArrayList<Spell>();
	}

	public void printBattleOptions() {
		for (int i = 0; i < spells.size(); i++) {
			System.out.println((i + 1) + ". " + spells.get(i).getName());
		}
	}

	public List<Spell> getSpells() {
		return spells;
	}

	public void addSpell(Spell newSpell) {
		spells.add(newSpell);
	}
}