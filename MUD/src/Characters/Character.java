package Characters;

public abstract class Character {
	
	
	public abstract int getHealth();
	
	public abstract void setHealth(int health);
	
	public abstract int getStrength();
	
	public abstract void setStrength(int strength);
	
	public abstract int getDexterity();
	
	public abstract void setDexterity(int dexterity);
	
	public abstract int getIntelligence();
	
	public abstract void setIntelligence(int intelligence);
	
	public abstract int getWisdom();
	
	public abstract void setWisdom(int wisdom);
	
	public abstract int getCharisma();
	
	public abstract void setCharisma(int charisma);
	
	public abstract int attack(); // probably take some arguments from weapon to increase damage....
	

}
