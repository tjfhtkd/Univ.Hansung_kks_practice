package kks.singletonApp.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import kks.singletonApp.Manager.PanelManager;
import kks.singletonApp.View.Wepon.WeponSelectButton;

public class WeponSelectListener implements ActionListener {
	private PanelManager panelManager;
	private ArrayList<WeponSelectButton> weponBtnList;

	public WeponSelectListener(PanelManager panelManager,
			ArrayList<WeponSelectButton> weponBtnList) {
		this.panelManager = panelManager;
		this.weponBtnList = weponBtnList;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		WeponSelectButton btn = (WeponSelectButton) event.getSource();
		String weponBtnName = btn.getWeponBtnName();

		for (WeponSelectButton weponBtn : weponBtnList) {
			if (weponBtn.getWeponBtnName().equalsIgnoreCase(weponBtnName)) {
				panelManager.changeWepon(weponBtn.getWepon());
			}
		}
	}

}
