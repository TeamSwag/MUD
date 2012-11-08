package Monsters;

public class Medium extends Monsters {
	
	private int hp;
	private int muscle;
	private int dex;
	private int intel;
	
	public Medium(){
		
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return muscle;
	}

	@Override
	public int getDexterity() {
		// TODO Auto-generated method stub
		return dex;
	}

	@Override
	public int getIntelligence() {
		// TODO Auto-generated method stub
		return intel;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

}
