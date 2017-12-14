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
    System.out.println("氏名："+ name);
    System.out.println("国語："+kokugo);
    System.out.println("算数："+sansu);
  }

}