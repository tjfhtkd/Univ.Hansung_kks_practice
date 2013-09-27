package kks.singletonApp.View.status;

import javax.swing.JLabel;

public class StatusValueLabel extends JLabel {
	private int incStat;

	public StatusValueLabel(int basicStatusValue) {
		this.setText(String.valueOf(basicStatusValue));
	}

	public void changeValue(int stat) {
		this.incStat = stat;
		new Thread(new StatusIncAnimThread()).start();
	}

	private void setTextStatusValue(int stat) {
		this.setText(String.valueOf(stat));
	}

	private class StatusIncAnimThread implements Runnable {
		@Override
		public void run() {
			for (int startIncNum = 0; startIncNum <= incStat; startIncNum++) {
				try {
					setTextStatusValue(startIncNum);
					Thread.sleep(10);
				} catch (InterruptedException e) {
				} finally {
					setTextStatusValue(incStat);
				}
			}
		}
	}

}
