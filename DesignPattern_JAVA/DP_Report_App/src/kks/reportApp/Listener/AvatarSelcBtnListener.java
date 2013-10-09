package kks.reportApp.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import kks.reportApp.Avatar.Avatar;
import kks.reportApp.Avatar.AvatarBonus;
import kks.reportApp.Avatar.DEFBonus;
import kks.reportApp.Avatar.HPBonus;
import kks.reportApp.Avatar.STRBonus;
import kks.reportApp.Character.Character;
import kks.reportApp.Character.Status;
import kks.reportApp.Frame.AvatarSelcFrame;

public class AvatarSelcBtnListener implements ActionListener {

	private Avatar[] avatarTypeList;
	private Character character;
	private AvatarSelcFrame avatarFrame;

	public AvatarSelcBtnListener(AvatarSelcFrame avatarFrame,
			Avatar[] avatarTypeList) {
		this.avatarFrame = avatarFrame;
		this.avatarTypeList = avatarTypeList;
		character = Character.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		selectStatus(Integer.valueOf(btn.getName()));
		avatarFrame.nextScreen();
	}

	private void selectStatus(int idx) {
		Avatar avatar = avatarTypeList[idx];
		AvatarBonus bonusType = avatar.getAvatarBonus();

		Status status = new Status();
		if (bonusType instanceof HPBonus) {
			int bonus = bonusType.getCalcBonus(Status.BASIC_HP);
			status.setHp(bonus);
		} else if (bonusType instanceof DEFBonus) {
			int bonus = bonusType.getCalcBonus(Status.BASIC_DEF);
			status.setDefence(bonus);
		} else if (bonusType instanceof STRBonus) {
			int bonus = bonusType.getCalcBonus(Status.BASIC_STR);
			status.setStrength(bonus);
		} else {
			// unknown exception
		}

		character.setStatus(status);
	}

}
