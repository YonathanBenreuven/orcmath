package yonathanPlayground;

import java.util.ArrayList;

public class CatalogMaker {
 private static ArrayList<Cards> cardList;
	
 	public CatalogMaker() {
 		cardList = new ArrayList<Cards>();
 		cardList.add(new Cards("imp","1/1",1));
 		cardList.add(new Cards("doubleimp","2/2",2));
 		cardList.add(new Cards("tripelimp","3/3",3));
	}

	public static void main(String[] args) {
		CatalogMaker c = new CatalogMaker();
		System.out.println(getCSVContent());
		//for(Cards e:cardList) {
			//System.out.println(e);
		//}

	}
	public static String getCSVContent() {
		String data = "";
		for(Cards e:cardList) {
			data+=e+"\n";
		}
		return data;
	}

}
