package kks.singletonApp.Character;

import kks.singletonApp.Item.Wepon;

public class Character {
	private static Character instance = null;

	private Status status;
	private Wepon equipWepon;

	private Character() {
		status = new Status();
		equipWepon = null;
	}

	public static Character getInstance() {
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

	public Wepon getEquipWepon() {
		return equipWepon;
	}

	public void setEquipWepon(Wepon equipWepon) {
		this.equipWepon = equipWepon;
	}

}
