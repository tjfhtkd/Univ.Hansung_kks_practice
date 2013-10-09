package kks.reportApp.Character;

public class Status {
	public static int BASIC_STR = 100;
	public static int BASIC_DEF = 10;
	public static int BASIC_DEX = 50;
	public static int BASIC_AGI = 20;
	public static int BASIC_HP = 500;

	private int strength;
	private int defence;
	private int dexterity;
	private int agility;
	private int hp;

	public Status() {
		// 기본 수치
		strength = BASIC_STR;
		defence = BASIC_DEF;
		dexterity = BASIC_DEX;
		agility = BASIC_AGI;
		hp = BASIC_HP;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
