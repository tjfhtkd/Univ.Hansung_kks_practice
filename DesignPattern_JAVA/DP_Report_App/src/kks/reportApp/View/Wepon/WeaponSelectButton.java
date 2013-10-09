package kks.reportApp.View.Wepon;

import javax.swing.JButton;

import kks.reportApp.Item.Weapon;

public class WeaponSelectButton extends JButton {
	private Weapon wepon;

	public WeaponSelectButton(Weapon wepon) {
		this.wepon = wepon;
		setText(wepon.getWeponName());
	}

	public void selectApperance() {
		setText(wepon.getWeponName() + " (ÀåÂø)");
	}

	public void selectCancleApperance() {
		setText(wepon.getWeponName());
	}

	public String getWeponBtnName() {
		return wepon.getWeponName();
	}

	public Weapon getWepon() {
		return wepon;
	}

}
