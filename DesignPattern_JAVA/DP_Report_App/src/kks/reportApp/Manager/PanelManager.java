package kks.reportApp.Manager;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import kks.reportApp.Character.Character;
import kks.reportApp.Item.Weapon;
import kks.reportApp.Listener.WeaponSelectListener;
import kks.reportApp.View.Equipment.EquipPanel;
import kks.reportApp.View.Wepon.WeaponPanel;
import kks.reportApp.View.status.StatusPanel;

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

		WeaponSelectListener listener = new WeaponSelectListener(this,
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
