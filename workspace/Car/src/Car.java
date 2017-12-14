
public class Car {
  public int gas=60;

  public void drive(int gas){
	  this.gas-=gas;
	  System.out.println(gas*10+"km走りました");
  }

  public void putGas(int gas){
	  this.gas+=gas;
	  System.out.println("ガソリンを"+gas+"リットル補給しました");
  }

  public void checkGas(){
	  System.out.println("ガソリンは残り"+this.gas+"リットルです");
  }
}
