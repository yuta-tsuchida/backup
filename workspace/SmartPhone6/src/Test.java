
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      SmartPhone iphone=new SmartPhone("iphone");
      System.out.println(iphone.name);

      SmartPhone iphone2=new SmartPhone(50000);
      System.out.println(iphone2.price);

      SmartPhone iphone3=new SmartPhone("iphone2",50000);
      System.out.println(iphone3.name);
      System.out.println(iphone3.price);

      SmartPhone iphone4=new SmartPhone(50000,"iphone3");
      System.out.println(iphone4.price);
      System.out.println(iphone4.name);
	}

}
