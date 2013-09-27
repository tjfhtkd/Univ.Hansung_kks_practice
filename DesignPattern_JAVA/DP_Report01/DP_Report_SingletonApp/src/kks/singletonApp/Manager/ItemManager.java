package kks.singletonApp.Manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import kks.singletonApp.Item.Weapon;

public class ItemManager {
	private static final Weapon[] weaponList = {
			new Weapon("A", 10, 20, 5, 5, 10, convertImgToPath("ip_058.jpg")),
			new Weapon("B", 5, 25, 8, 8, 10, convertImgToPath("")),
			new Weapon("C", 15, 5, 18, 3, 6, convertImgToPath("ip_085.jpg")),
			new Weapon("D", 500, 30, 1, 1, 1, null) };
	private ArrayList<Weapon> weaponArrList;

	public ItemManager() {
		weaponArrList = new ArrayList<Weapon>();
		createWeaponList();
	}

	public ArrayList<Weapon> getWeaponList() {
		return weaponArrList;
	}

	private void createWeaponList() {
		for (int startNum = 0; startNum < weaponList.length; startNum++) {
			weaponArrList.add(weaponList[startNum]);
		}
	}

	private static ImageIcon convertImgToPath(String path) {
		ImageIcon convertImg = null;
		try {
			convertImg = new ImageIcon(ImageIO.read(new File(path)));
		} catch (IOException e) {
		}
		return convertImg;
	}
}
