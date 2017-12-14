import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
  public static void main(String[] args) throws IOException{
	  Person sabro=new Person("sabro",20);
	  System.out.println(sabro.name);
	  System.out.println(sabro.age);
	  Person shiro=new Person("shiro");
	  System.out.println(shiro.name);
	  System.out.println(shiro.age);
	  Person nanasi=new Person(16);
	  System.out.println(nanasi.name);
	  System.out.println(nanasi.age);

	  Person p =new Person();
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  for(int i=0; i<5; i++){
	    System.out.println("名前を入力してください");
	    p.name=br.readLine();
	    System.out.println(p.name);
	    p.talk();
	    p.walk();
	    p.run();
	  }
  }
}
