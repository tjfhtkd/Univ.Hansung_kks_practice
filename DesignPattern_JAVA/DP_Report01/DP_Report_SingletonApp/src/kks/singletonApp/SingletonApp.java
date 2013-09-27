package kks.singletonApp;

import javax.swing.JFrame;

import kks.singletonApp.Manager.ItemManager;
import kks.singletonApp.Manager.PanelManager;

public class SingletonApp extends JFrame {

	public SingletonApp() {
		ItemManager itemManager = new ItemManager();
		PanelManager panelManager = new PanelManager(itemManager);
		add(panelManager.getBoard());

		setTitle("ΩÃ±€≈Ê øπ¡¶ æ€");
		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SingletonApp();
	}

}
