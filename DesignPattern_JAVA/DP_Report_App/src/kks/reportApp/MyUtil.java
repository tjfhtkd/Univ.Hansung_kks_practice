package kks.reportApp;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MyUtil {
	public static ImageIcon convertImgToPath(String path) {
		ImageIcon convertImg = null;
		try {
			convertImg = new ImageIcon(ImageIO.read(new File(path)));
		} catch (IOException e) {
		}
		return convertImg;
	}
}
