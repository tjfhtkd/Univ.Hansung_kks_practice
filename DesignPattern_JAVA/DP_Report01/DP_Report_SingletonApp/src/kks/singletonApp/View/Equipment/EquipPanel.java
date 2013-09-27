package kks.singletonApp.View.Equipment;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import kks.singletonApp.Item.Wepon;

public class EquipPanel extends JPanel {
	private EquipImageLabel weponImgLabel;
	private JLabel weponNameLabel;
	private JLabel weponInfoLabel;

	public EquipPanel() {
		weponNameLabel = new JLabel("맨손");
		weponImgLabel = new EquipImageLabel(" x ");
		weponInfoLabel = new JLabel("무기 정보가 없습니다.");
		setEquipPanel();
	}

	public void changeWeponImg(Wepon wepon) {
		weponNameLabel.setText(wepon.getWeponName());
		weponInfoLabel.setText(wepon.getAgility() + "/" + wepon.getDamage()
				+ "/" + wepon.getDefence() + "/" + wepon.getDexterity() + "/"
				+ wepon.getStrength());
		weponImgLabel.loadWeponImage(wepon.getwImg());
	}

	private void setEquipPanel() {
		setLayout(new GridLayout(3, 1));
		add(weponNameLabel);
		add(weponImgLabel);
		add(weponInfoLabel);
	}

}
