package kks.reportApp.Avatar;

public class STRBonus implements AvatarBonus {

	@Override
	public int getCalcBonus(int status) {
		return (int) (status + status * 0.23);
	}

}
