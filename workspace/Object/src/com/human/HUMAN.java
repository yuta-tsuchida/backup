package com.human;

public class HUMAN {
	
	public static String sei;
	public static String mei;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		System.out.println("HelloWorld");
		sei="土田";
		mei="悠太";
		System.out.println(sei + mei);
		
		HumanName humanName=new HumanName();
		System.out.println(humanName.getName());
		String sei1=humanName.sei;
		String mei1=humanName.getMei();
		
		HumanName humanName2=new HumanName("田中","太郎");
		System.out.println(humanName2.getName());
	}

}
