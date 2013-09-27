package kks.singletonApp.View.Equipment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class EquipImageLabel extends JLabel {
	private BufferedImage image;

	/*
	 * @Override protected void paintComponent(Graphics g) {
	 * super.paintComponent(g); g.drawImage(image, 0, 0, null); // see javadoc
	 * for more info on the parameters }
	 */

	public EquipImageLabel(String text) {
		setText(text);
	}

	public void loadWeponImage(BufferedImage getwImg) {
		try {
			image = ImageIO.read(new File("image name and path"));
		} catch (IOException ex) {
			setText("No Image");
		}
	}

}
