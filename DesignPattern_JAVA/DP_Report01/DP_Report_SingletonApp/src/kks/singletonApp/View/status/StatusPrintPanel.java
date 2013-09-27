package kks.singletonApp.View.status;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class StatusPrintPanel extends JPanel {
	private StatusTypeNameLable statTypeNameLabel;
	private StatusValueLabel statValueLabel;
	private String statTypeName;

	public StatusPrintPanel(String statTypeName, int basicStatusValue) {
		statTypeNameLabel = new StatusTypeNameLable(statTypeName);
		statValueLabel = new StatusValueLabel(basicStatusValue);
		this.statTypeName = statTypeName;

		setPanel();
	}

	public void changeStatus(int stat) {
		statValueLabel.changeValue(stat);
	}

	public String getTypeName() {
		return statTypeName;
	}

	private void setPanel() {
		setLayout(new GridLayout(1, 2));
		add(statTypeNameLabel);
		add(statValueLabel);
	}

}
