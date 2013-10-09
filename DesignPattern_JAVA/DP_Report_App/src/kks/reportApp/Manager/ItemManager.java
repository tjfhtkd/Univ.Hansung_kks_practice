package kks.reportApp.Manager;

import java.util.ArrayList;

import kks.reportApp.MyUtil;
import kks.reportApp.Item.Weapon;

public class ItemManager {
	private static final Weapon[] weaponList = {
			new Weapon("A", 10, 20, 5, 5, 10,
					MyUtil.convertImgToPath("res/weapon/ip_058.jpg")),
			new Weapon("B", 5, 25, 8, 8, 10, MyUtil.convertImgToPath("")),
			new Weapon("C", 15, 5, 18, 3, 6,
					MyUtil.convertImgToPath("res/weapon/ip_085.jpg")),
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

}
