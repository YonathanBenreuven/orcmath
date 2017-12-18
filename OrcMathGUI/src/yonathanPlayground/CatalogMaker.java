package yonathanPlayground;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		while(cardList.size()<10) {	 
			 addCard();
			 System.out.println(getCSVContent());
			
			}
		}
	
	public static void addCard() {
		System.out.println("what is the name of the card you want to add");
		Scanner in = new Scanner(System.in);
		 String s = in.nextLine();
		 
		 System.out.println("what is the effect or stats of the card you want to add");
			
			 String d = in.nextLine();
			 
			 System.out.println("what is the cost of the card you want to add");
				
			 int f = Integer.parseInt(in.nextLine());
			 
			 
			 System.out.println(getCSVContent());
			cardList.add(new Cards(s,d,f));
		
		
	}
	
	public static String getCSVContent() {
		String data = "";
		for(Cards e:cardList) {
			data+=e+"\n";
		}
		return data;
	}

}
