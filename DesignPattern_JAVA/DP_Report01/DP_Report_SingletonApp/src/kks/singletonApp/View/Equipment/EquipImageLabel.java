package kks.singletonApp.View.Equipment;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EquipImageLabel extends JLabel {

	public EquipImageLabel(String text) {
		setText(text);
	}

	public void loadWeponImage(ImageIcon getwImg) {
		if (getwImg == null) {
			setText(" x ");
		} else {
			setText("");
		}
		setIcon(getwImg);
	}

}
