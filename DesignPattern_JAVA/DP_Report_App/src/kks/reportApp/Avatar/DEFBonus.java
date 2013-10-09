package kks.reportApp.Avatar;

public class DEFBonus implements AvatarBonus {

	@Override
	public int getCalcBonus(int status) {
		return (int) (status + status * 0.3) + 25;
	}

}
