package kks.reportApp.Item;

import javax.swing.ImageIcon;

public class Weapon {
	private ImageIcon wImg;
	private String wName;
	private int wStrength;
	private int wDamage;
	private int wDefence;
	private int wDexterity;
	private int wAgility;

	public Weapon(String name, int str, int dmg, int def, int dex, int agi,
			ImageIcon img) {
		wStrength = str;
		wName = name;
		wDamage = dmg;
		wDefence = def;
		wDexterity = dex;
		wAgility = agi;
		wImg = img;
	}

	public String getWeponName() {
		return wName;
	}

	public void setWeponName(String wName) {
		this.wName = wName;
	}

	public int getDamage() {
		return wDamage;
	}

	public void setDamage(int wDamage) {
		this.wDamage = wDamage;
	}

	public int getDefence() {
		return wDefence;
	}

	public void setDefence(int wDefence) {
		this.wDefence = wDefence;
	}

	public int getDexterity() {
		return wDexterity;
	}

	public void setDexterity(int wDexterity) {
		this.wDexterity = wDexterity;
	}

	public int getAgility() {
		return wAgility;
	}

	public void setAgility(int wAgility) {
		this.wAgility = wAgility;
	}

	public ImageIcon getwImg() {
		return wImg;
	}

	public void setwImg(ImageIcon wImg) {
		this.wImg = wImg;
	}

	public int getStrength() {
		return wStrength;
	}

	public void setStrength(int wStrength) {
		this.wStrength = wStrength;
	}

}
