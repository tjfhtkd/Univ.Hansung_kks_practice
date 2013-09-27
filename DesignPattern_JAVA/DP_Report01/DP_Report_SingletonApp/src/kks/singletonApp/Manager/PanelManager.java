package kks.singletonApp.Manager;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import kks.singletonApp.Character.Character;
import kks.singletonApp.Item.Weapon;
import kks.singletonApp.Listener.WeponSelectListener;
import kks.singletonApp.View.Equipment.EquipPanel;
import kks.singletonApp.View.Wepon.WeaponPanel;
import kks.singletonApp.View.status.StatusPanel;

public class PanelManager {
	private JPanel board;
	private Character character;
	private StatusPanel statusPanel;
	private WeaponPanel weponPanel;
	private EquipPanel equipPanel;

	public PanelManager(ItemManager itemManager) {
		ArrayList<Weapon> weponList = itemManager.getWeaponList();

		character = Character.getInstance();
		statusPanel = new StatusPanel();
		weponPanel = new WeaponPanel(weponList);
		equipPanel = new EquipPanel();

		WeponSelectListener listener = new WeponSelectListener(this,
				weponPanel.getWeponBtnList());
		weponPanel.addListenerToWeponBtns(listener);

		board = new JPanel();
		board.setLayout(new GridLayout(1, 3));
		board.add(statusPanel);
		board.add(equipPanel);
		board.add(weponPanel);
	}

	public void changeWepon(Weapon wepon) {
		statusPanel.changeStatus(wepon);
		weponPanel.changeWepon(wepon);
		equipPanel.changeWeponImg(wepon);
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public StatusPanel getStatusPanel() {
		return statusPanel;
	}

	public void setStatusPanel(StatusPanel statusPanel) {
		this.statusPanel = statusPanel;
	}

	public WeaponPanel getWeponPanel() {
		return weponPanel;
	}

	public void setWeponPanel(WeaponPanel weponPanel) {
		this.weponPanel = weponPanel;
	}

	public EquipPanel getEquipPanel() {
		return equipPanel;
	}

	public void setEquipPanel(EquipPanel equipPanel) {
		this.equipPanel = equipPanel;
	}

	public JPanel getBoard() {
		return board;
	}

}
