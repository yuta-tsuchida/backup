class Student{
  private String name;
  private int kokugo;
  private int sansu;

  
    Student(String name,int kokugo,int sansu){
      this.name=name;
      this.kokugo=kokugo;
      this.sansu=sansu;
    }
    Student(String name){
      this(name,0,0);
    }

    public int getKokugo(){
      return this.kokugo;
    }

    public int getSansu(){
      return this.sansu;
    }
  
  
  public void show(){
    System.out.println("–¼F"+ name);
    System.out.println("‘ŒêF"+kokugo);
    System.out.println("Z”F"+sansu);
  }

}