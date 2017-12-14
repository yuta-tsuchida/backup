class Goods{
  String name;
  int cost;
  double rate;

  Goods(String n,int c){
    this.name=n;
    this.cost=c;
    
  }

  Goods(String n){
    this(n,0);
  }

  

  

  public void setName(String n){
    this.name=n;
  }

  public void setCost(int c){
    this.cost=c;
  }

  public void setRate(double r){
    this.rate=r;
  }

  public void show(){
    System.out.println("¤•i–¼F"+name);
    System.out.println("Å”²‰¿ŠiF"+cost);
    System.out.println("Á”ïÅF"+rate);
    System.out.println("Å‰¿ŠiG"+cost*(1+rate));
    
  }
}