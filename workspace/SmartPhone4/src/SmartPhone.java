
public class SmartPhone {
  public String name=null;
  public int price=0;

  public SmartPhone(){}

  public SmartPhone(String name){
	  this.name=name;
  }

  public SmartPhone(int price){
	  this.price=price;
  }

  public SmartPhone(String name,int price){
	  this.name=name;
	  this.price=price;
  }

  public SmartPhone(int price,String name){
	  this.name=name;
	  this.price=price;
  }
}
