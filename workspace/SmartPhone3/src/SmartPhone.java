
public class SmartPhone {
  private String name=null;
  private int price=0;

  public SmartPhone(String name,int price){
	  this.name=name;
	  this.price=price;
  }

  public String getName(){
	  return this.name;
  }
  public void setName(String name){
	  this.name=name;
  }

  public int getPrice(){
	  return this.price;
  }
  public void setPrice(int price){
	  this.price=price;
  }
}
