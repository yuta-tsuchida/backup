
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      SmartPhone iphone=new SmartPhone("iphone",50000);

      iphone.setName("iphone");
      iphone.setPrice(50000);
      String name=iphone.getName();
      int price=iphone.getPrice();
      System.out.println(name);
      System.out.println(price);


	  SmartPhone android=new SmartPhone("android",40000);

	  android.setName("android");
	  android.setPrice(40000);
	  String name2=android.getName();
	  int price2=android.getPrice();
	  System.out.println(name2);
	  System.out.println(price2);
	}
}
