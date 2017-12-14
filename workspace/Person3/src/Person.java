
public class Person {
  public String name=null;
  public int age=0;

  public Person(String name,int age){
	  this.name=name;
	  this.age=age;
  }

  public void talk(){
	  System.out.println(this.name+"が話す");
  }
  public void walk(){
	  System.out.println(this.name+"が歩く");
  }
  public void run(){
	  System.out.println(this.name+"が走る");
  }
}
