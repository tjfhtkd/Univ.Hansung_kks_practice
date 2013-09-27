package kks.singletonApp.View.Wepon;

import javax.swing.JButton;

import kks.singletonApp.Item.Wepon;

public class WeponSelectButton extends JButton {
	private Wepon wepon;

	public WeponSelectButton(Wepon wepon) {
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

	public Wepon getWepon() {
		return wepon;
	}

}
