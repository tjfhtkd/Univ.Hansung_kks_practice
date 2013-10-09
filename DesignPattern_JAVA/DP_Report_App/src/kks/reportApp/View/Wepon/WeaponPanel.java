package kks.reportApp.View.Wepon;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import kks.reportApp.Item.Weapon;

public class WeaponPanel extends JPanel {
	private ArrayList<WeaponSelectButton> weponBtnList;

	public WeaponPanel(ArrayList<Weapon> weponList) {
		weponBtnList = new ArrayList<WeaponSelectButton>();
		createWeponBtn(weponList);
		setWeponPanel(weponBtnList);
	}

	public void changeWepon(Weapon wepon) {
		for (WeaponSelectButton weponBtn : weponBtnList) {
			if (weponBtn.getWeponBtnName().equalsIgnoreCase(
					wepon.getWeponName())) {
				weponBtn.selectApperance();
			} else {
				weponBtn.selectCancleApperance();
			}
		}
	}

	public void addListenerToWeponBtns(ActionListener listener) {
		for (WeaponSelectButton weponBtn : weponBtnList) {
			weponBtn.addActionListener(listener);
		}
	}

	public ArrayList<WeaponSelectButton> getWeponBtnList() {
		return weponBtnList;
	}

	private void createWeponBtn(ArrayList<Weapon> weponList) {
		for (Weapon wepon : weponList) {
			weponBtnList.add(new WeaponSelectButton(wepon));
		}
	}

	private void setWeponPanel(ArrayList<WeaponSelectButton> weponList) {
		setLayout(new GridLayout(weponList.size(), 1));
		for (WeaponSelectButton selcBtn : weponList) {
			add(selcBtn);
		}
	}

}
