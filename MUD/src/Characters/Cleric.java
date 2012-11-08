package Characters;

public class Cleric extends Character {

	private int hp;
	private int muscle;
	private int intel;
	private int dex;
	private int wis;
	private int chr;

	public Cleric() {

	}

	@Override
	public int getHealth() {
		return hp;
	}

	@Override
	public void setHealth(int health) {
		hp = hp + health;

	}

	@Override
	public int getStrength() {
		return muscle;
	}

	@Override
	public void setStrength(int strength) {
		muscle = muscle + strength;
	}

	@Override
	public int getDexterity() {
		return dex;
	}

	@Override
	public void setDexterity(int dexterity) {
		dex = dex + dexterity;
	}

	@Override
	public int getIntelligence() {
		return intel;
	}

	@Override
	public void setIntelligence(int intelligence) {
		intel = intel + intelligence;
	}

	@Override
	public int getWisdom() {
		return wis;
	}

	@Override
	public void setWisdom(int wisdom) {
		wis = wis + wisdom;
	}

	@Override
	public int getCharisma() {
		return chr;
	}

	@Override
	public void setCharisma(int charisma) {
		chr = chr + charisma;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

}
