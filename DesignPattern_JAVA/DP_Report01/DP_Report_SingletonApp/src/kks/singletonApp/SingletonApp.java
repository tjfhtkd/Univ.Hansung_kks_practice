package kks.singletonApp;

import javax.swing.JFrame;

import kks.singletonApp.Character.Character;
import kks.singletonApp.View.PanelManager;
import kks.singletonApp.View.Equipment.EquipPanel;
import kks.singletonApp.View.Wepon.WeponPanel;
import kks.singletonApp.View.status.StatusPanel;

public class SingletonApp extends JFrame {
	private PanelManager panelManager;

	public SingletonApp() {
		Character character = Character.getInstance();
		StatusPanel statusPanel = new StatusPanel();
		WeponPanel weponPanel = new WeponPanel();
		EquipPanel equipPanel = new EquipPanel();

		panelManager = new PanelManager(character, statusPanel, weponPanel,
				equipPanel);
		add(panelManager.getBoard());

		setTitle("ΩÃ±€≈Ê øπ¡¶ æ€");
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SingletonApp();
	}

}
