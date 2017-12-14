
public class Test{
	public static void main(String[] args){
		Person taro=new Person("山田太郎",20);

		taro.setName("佐藤太郎");
		System.out.println(taro.getName());
		System.out.println(taro.getAge());

		taro.talk();
		taro.walk();
		taro.run();

		Person hanako=new Person("鈴木花子",18);
		System.out.println(hanako.getName());
		System.out.println(hanako.getAge());

		hanako.talk();
		hanako.walk();
		hanako.run();

		Person nanashi=new Person(30);
		System.out.println(nanashi.getName());
		System.out.println(nanashi.getAge());

		Person jiro=new Person("田中次郎");
		System.out.println(jiro.getName());
		System.out.println(jiro.getAge());
	}
}