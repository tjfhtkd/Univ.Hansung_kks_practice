package kks.reportApp.Avatar;

public class HPBonus implements AvatarBonus {

	@Override
	public int getCalcBonus(int status) {
		return (int) (status + status * 0.12);
	}

}
