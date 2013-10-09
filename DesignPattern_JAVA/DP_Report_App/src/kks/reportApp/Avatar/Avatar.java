package kks.reportApp.Avatar;

import javax.swing.ImageIcon;

import kks.reportApp.MyUtil;

public class Avatar {
	private ImageIcon avatarImg;
	private AvatarBonus avatarBonus;

	public Avatar(AvatarBonus avatarBonus) {
		this.avatarBonus = avatarBonus;
	}

	public void setAvatarImg(String imgPath) {
		avatarImg = MyUtil.convertImgToPath(imgPath);
	}

	public ImageIcon getAvatarImg() {
		return avatarImg;
	}

	public void setAvatarBonus(AvatarBonus avatarBonus) {
		this.avatarBonus = avatarBonus;
	}

	public AvatarBonus getAvatarBonus() {
		return avatarBonus;
	}
}
