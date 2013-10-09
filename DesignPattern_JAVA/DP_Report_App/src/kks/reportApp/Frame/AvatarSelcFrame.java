package kks.reportApp.Frame;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kks.reportApp.Avatar.Avatar;
import kks.reportApp.Avatar.Carp;
import kks.reportApp.Avatar.DEFBonus;
import kks.reportApp.Avatar.HPBonus;
import kks.reportApp.Avatar.STRBonus;
import kks.reportApp.Avatar.Turkey;
import kks.reportApp.Avatar.UnicornLion;
import kks.reportApp.Listener.AvatarSelcBtnListener;

public class AvatarSelcFrame extends JFrame {
	private Avatar[] avatarType = { new UnicornLion(new HPBonus()),
			new Turkey(new STRBonus()), new Carp(new DEFBonus()) };
	private String[] avatarImgPath = { "res/avatar/UnicornLion.jpg",
			"res/avatar/Turkey.jpg", "res/avatar/Carp.jpg" };

	private static int AVATARFRAME_H_SIZE = 150;
	private static int AVATARFRAME_W_SIZE = 300;

	private int avatarTypeCnt = 0;

	public AvatarSelcFrame() {
		avatarTypeCnt = avatarType.length;
		viewAvatarSelcFrame();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(AVATARFRAME_W_SIZE, AVATARFRAME_H_SIZE);
		setVisible(true);
	}

	private void viewAvatarSelcFrame() {
		this.setTitle("�ƹ�Ÿ ���� ȭ��");
		this.add(setAvatarPanel());
	}

	private JPanel setAvatarPanel() {
		JPanel avatarSelcPanel = new JPanel();
		avatarSelcPanel.setLayout(new GridLayout(1, 3));

		ActionListener selcBtnListener = new AvatarSelcBtnListener(this,
				avatarType);
		ImageIcon img = null;
		Image avatarImg;
		Avatar avatar = null;

		int imgSize = AVATARFRAME_W_SIZE / avatarTypeCnt;
		int pathArrLength = avatarImgPath.length; // ����ó����
		for (int idx = 0; idx < avatarType.length; idx++) {
			avatar = avatarType[idx];

			// �̹��� ��ΰ� �� �������� ���� ����ó��.
			if (idx < pathArrLength) {
				avatar.setAvatarImg(avatarImgPath[idx]);

				// �̹��� ������ ���߱�
				img = avatar.getAvatarImg();
				avatarImg = img.getImage().getScaledInstance(imgSize, imgSize,
						0);
				img.setImage(avatarImg);
				JButton avatarBtn = new JButton(img);

				// ������ ����
				avatarBtn.addActionListener(selcBtnListener);

				// �� ��ư�� idx ���ڷ� �̸��� �����ش�. Ȥ�� ������ ���� �߰���.
				avatarBtn.setName(String.valueOf(idx));
				avatarSelcPanel.add(avatarBtn);
			}

		}

		return avatarSelcPanel;
	}

	// ���� ȭ���� ���� ���� â���� �Ѿ��.
	public void nextScreen() {
		new WeaponSelcFrame();
		this.setVisible(false);
	}
}