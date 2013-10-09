package kks.reportApp.Frame;

import javax.swing.JFrame;

import kks.reportApp.Manager.ItemManager;
import kks.reportApp.Manager.PanelManager;

public class WeaponSelcFrame extends JFrame {

	public WeaponSelcFrame() {
		viewWeaponSelcFrame();
		
		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void viewWeaponSelcFrame() {
		ItemManager itemManager = new ItemManager();
		PanelManager panelManager = new PanelManager(itemManager);
		add(panelManager.getBoard());

		setTitle("장비 선택 화면");
	}
}
