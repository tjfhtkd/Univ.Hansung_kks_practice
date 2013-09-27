package kks.singletonApp.View.Wepon;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import kks.singletonApp.Item.Wepon;

public class WeponPanel extends JPanel {
	private ArrayList<WeponSelectButton> weponBtnList;

	public WeponPanel(ArrayList<Wepon> weponList) {
		weponBtnList = new ArrayList<WeponSelectButton>();
		createWeponBtn(weponList);
		setWeponPanel(weponBtnList);
	}

	public void changeWepon(Wepon wepon) {
		for (WeponSelectButton weponBtn : weponBtnList) {
			if (weponBtn.getWeponBtnName().equalsIgnoreCase(
					wepon.getWeponName())) {
				weponBtn.selectApperance();
			} else {
				weponBtn.selectCancleApperance();
			}
		}
	}

	public void addListenerToWeponBtns(ActionListener listener) {
		for (WeponSelectButton weponBtn : weponBtnList) {
			weponBtn.addActionListener(listener);
		}
	}

	public ArrayList<WeponSelectButton> getWeponBtnList() {
		return weponBtnList;
	}

	private void createWeponBtn(ArrayList<Wepon> weponList) {
		for (Wepon wepon : weponList) {
			weponBtnList.add(new WeponSelectButton(wepon));
		}
	}

	private void setWeponPanel(ArrayList<WeponSelectButton> weponList) {
		setLayout(new GridLayout(weponList.size(), 1));
		for (WeponSelectButton selcBtn : weponList) {
			add(selcBtn);
		}
	}

}
