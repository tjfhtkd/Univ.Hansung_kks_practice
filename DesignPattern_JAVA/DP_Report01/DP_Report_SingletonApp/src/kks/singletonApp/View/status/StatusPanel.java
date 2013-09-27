package kks.singletonApp.View.status;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import kks.singletonApp.Character.Character;
import kks.singletonApp.Character.Status;
import kks.singletonApp.Item.Wepon;

public class StatusPanel extends JPanel {
	private final String STATUSNAME_STR = "STR";
	private final String STATUSNAME_DEF = "DEF";
	private final String STATUSNAME_DEX = "DEX";
	private final String STATUSNAME_AGI = "AGI";
	private final String STATUSNAME_HP = "HP";
	private final String[] statusList = { STATUSNAME_STR, STATUSNAME_DEF,
			STATUSNAME_DEX, STATUSNAME_AGI, STATUSNAME_HP };

	private ArrayList<StatusPrintPanel> printPanelList;
	private Status characterStatus;

	public StatusPanel() {
		Character character = Character.getInstance();
		characterStatus = character.getStatus();
		setPanelList();
		addStatPanel(printPanelList);
	}

	public void changeStatus(Wepon wepon) {
		for (StatusPrintPanel panel : printPanelList) {
			panel.changeStatus(getCalcStatus(panel.getTypeName(), wepon));
		}
	}

	private void setPanelList() {
		printPanelList = new ArrayList<StatusPrintPanel>();
		String typeName;
		for (int startNum = 0; startNum < statusList.length; startNum++) {
			typeName = statusList[startNum];
			printPanelList.add(new StatusPrintPanel(typeName,
					getBasicStatus(typeName)));
		}
	}

	private void addStatPanel(ArrayList<StatusPrintPanel> printPanelList) {
		setLayout(new GridLayout(printPanelList.size(), 1));
		for (StatusPrintPanel panel : printPanelList) {
			add(panel);
		}
	}

	private int getCalcStatus(String typeName, Wepon wepon) {
		int basicValue = getBasicStatus(typeName);
		int weponBonusValue = 0;

		switch (typeName) {
		case STATUSNAME_STR:
			weponBonusValue = wepon.getStrength();
			break;
		case STATUSNAME_DEF:
			weponBonusValue = wepon.getDefence();
			break;
		case STATUSNAME_DEX:
			weponBonusValue = wepon.getDexterity();
			break;
		case STATUSNAME_AGI:
			weponBonusValue = wepon.getAgility();
			break;
		case STATUSNAME_HP:
			weponBonusValue = wepon.getStrength() / 4;
			break;
		default:
			weponBonusValue = 0;
			break;
		}

		return basicValue + weponBonusValue;
	}

	private int getBasicStatus(String typeName) {
		switch (typeName) {
		case STATUSNAME_STR:
			return characterStatus.getStrength();
		case STATUSNAME_DEF:
			return characterStatus.getDefence();
		case STATUSNAME_DEX:
			return characterStatus.getDexterity();
		case STATUSNAME_AGI:
			return characterStatus.getAgility();
		case STATUSNAME_HP:
			return characterStatus.getHp();
		default:
			return 0;
		}
	}

}
