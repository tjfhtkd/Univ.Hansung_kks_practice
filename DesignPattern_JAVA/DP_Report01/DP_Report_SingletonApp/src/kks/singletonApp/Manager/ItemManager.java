package kks.singletonApp.Manager;

import java.util.ArrayList;

import kks.singletonApp.Item.Wepon;

public class ItemManager {
	private static final Wepon[] weponList = {
			new Wepon("A", 10, 20, 5, 5, 10, null),
			new Wepon("B", 5, 25, 8, 8, 10, null),
			new Wepon("C", 15, 5, 18, 3, 6, null),
			new Wepon("D", 500, 30, 1, 1, 1, null) };
	private ArrayList<Wepon> weponArrList;

	public ItemManager() {
		weponArrList = new ArrayList<Wepon>();
		createWeponList();
	}

	public ArrayList<Wepon> getWeponList() {
		return weponArrList;
	}

	private void createWeponList() {
		for (int startNum = 0; startNum < weponList.length; startNum++) {
			weponArrList.add(weponList[startNum]);
		}
	}
}
