package kks.singletonApp.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import kks.singletonApp.Manager.PanelManager;
import kks.singletonApp.View.Wepon.WeaponSelectButton;

public class WeponSelectListener implements ActionListener {
	private PanelManager panelManager;
	private ArrayList<WeaponSelectButton> weponBtnList;

	public WeponSelectListener(PanelManager panelManager,
			ArrayList<WeaponSelectButton> weponBtnList) {
		this.panelManager = panelManager;
		this.weponBtnList = weponBtnList;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		WeaponSelectButton btn = (WeaponSelectButton) event.getSource();
		String weponBtnName = btn.getWeponBtnName();

		for (WeaponSelectButton weponBtn : weponBtnList) {
			if (weponBtn.getWeponBtnName().equalsIgnoreCase(weponBtnName)) {
				panelManager.changeWepon(weponBtn.getWepon());
			}
		}
	}

}
