package kks.singletonApp.Character;

import kks.singletonApp.Item.Weapon;

public class Character {
	private static Character instance = null;

	private Status status;
	private Weapon equipWepon;

	private Character() {
		status = new Status();
		equipWepon = null;
	}

	synchronized public static Character getInstance() {
		if (instance == null) {
			instance = new Character();
		}
		return instance;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Weapon getEquipWepon() {
		return equipWepon;
	}

	public void setEquipWepon(Weapon equipWepon) {
		this.equipWepon = equipWepon;
	}

}
