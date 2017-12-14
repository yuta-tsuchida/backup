class Figure{
  private int base;
  private int height;

  public Figure(int base,int height){
    setBase(base);
    setHeight(height);
  }

  public void show(){
    System.out.println("’ê•ÓF"+base+"cm");
    System.out.println("‚‚³F"+height+"cm");
  }

  public double getArea(){
    return 0.0;
  }

  public void setBase(int base){
    if(base>0){
      this.base=base;
    }
  }

  public void setHeight(int height){
    if(height>0){
      this.height=height;
    }
  }

  public int getBase(){
    return base;
  }

  public int getHeight(){
    return height;
  }
}