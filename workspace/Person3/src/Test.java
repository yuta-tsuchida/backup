
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      Person taro=new Person("山田太郎",20);

      taro.talk();
      taro.walk();
      taro.run();

      System.out.println(taro.name);
      System.out.println(taro.age);


      Robot a=new Robot("aibo");
        System.out.println(a.name);
        a.talk();
        a.walk();
        a.run();
      Robot b=new Robot("asimo");
        System.out.println(b.name);
        b.talk();
        b.walk();
        b.run();
      Robot c=new Robot("pepper");
        System.out.println(c.name);
        c.talk();
        c.walk();
        c.run();
      Robot d=new Robot("doraemon");
        System.out.println(d.name);
        d.talk();
        d.walk();
        d.run();
	}

}
