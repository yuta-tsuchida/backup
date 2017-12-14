
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      Person taro=new Person();
      taro.name="山田太郎";
      taro.age=20;
      taro.tell="090-0000-0000";
      taro.email="abc@gmail.com";
      taro.address="東京";

      taro.talk();
      taro.walk();
      taro.run();
      System.out.println(taro.name);
      System.out.println(taro.age);
      System.out.println(taro.tell);
      System.out.println(taro.email);
      System.out.println(taro.address);

      Person jiro =new Person();
      jiro.name="木村次郎";
      jiro.age=18;
      jiro.tell="080-0000-0000";
      jiro.email="defc@gmail.com";
      jiro.address="神奈川";

      jiro.talk();
      jiro.walk();
      jiro.run();

      System.out.println(jiro.name);
      System.out.println(jiro.age);
      System.out.println(jiro.tell);
      System.out.println(jiro.email);
      System.out.println(jiro.address);

      Person hanako=new Person();
      hanako.name="鈴木花子";
      hanako.age=23;
      hanako.tell="070-0000-0000";
      hanako.email="ghi@gmail.com";
      hanako.address="千葉";

      hanako.talk();
      hanako.walk();
      hanako.run();

      System.out.println(hanako.name);
      System.out.println(hanako.age);
      System.out.println(hanako.tell);
      System.out.println(hanako.email);
      System.out.println(hanako.address);

      Person yuta=new Person();
      yuta.name="土田悠太";
      yuta.age=23;
      yuta.tell="080-0000-0000";
      yuta.email="ttty@gmail.com";
      yuta.address="埼玉";

      yuta.talk();
      yuta.walk();
      yuta.run();

      System.out.println(yuta.name);
      System.out.println(yuta.age);
      System.out.println(yuta.tell);
      System.out.println(yuta.email);
      System.out.println(yuta.address);

      Robot a=new Robot();
  	  a.name="aibo";
  	  a.talk();
  	  a.walk();
  	  a.run();

  	  Robot b =new Robot();
  	  b.name="asimo";
  	  b.talk();
  	  b.walk();
  	  b.run();

  	  Robot c=new Robot();
  	  c.name="pepper";
  	  c.talk();
  	  c.walk();
  	  c.run();

  	  Robot d=new Robot();
  	  d.name="doraemon";
  	  d.talk();
  	  d.walk();
  	  d.run();
	}




}
