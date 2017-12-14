class Exercise03{
  public static void main(String[] args){
    
    Goods s=new Goods("千葉県産　スイカ(M)",980);
    
    s.setRate(0.05);
    s.show();

    Goods b=new Goods("フィリピン産　バナナ",400);
    s.setRate(0.05);
    b.show();
    
  }
}