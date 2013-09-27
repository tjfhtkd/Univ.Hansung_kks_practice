package kks.singletonApp.View.status;

import javax.swing.JLabel;

public class StatusValueLabel extends JLabel {
	private int incStat;
	private StatusIncAnimThread anim;

	public StatusValueLabel(int basicStatusValue) {
		this.setText(String.valueOf(basicStatusValue));
		anim = new StatusIncAnimThread();
	}

	public void changeValue(int stat) {
		this.incStat = stat;
		new Thread(anim).start();
	}

	private void setTextStatusValue(int stat) {
		this.setText(String.valueOf(stat));
	}

	private class StatusIncAnimThread implements Runnable {
		@Override
		public void run() {
			int widthIncNum = 1;

			if (incStat > 300) {
				widthIncNum = 5;
			}

			for (int startIncNum = 0; startIncNum <= incStat; startIncNum += widthIncNum) {
				try {
					setTextStatusValue(startIncNum);
					Thread.sleep(10);
				} catch (InterruptedException e) {
					break;
				}
			}

			setTextStatusValue(incStat);
		}
	}

}
