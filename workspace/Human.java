public class Human{
  private static int count_Human=0;
  private String name;
  private int birthday;
  private int manpukudo;
  

  Human(String name,int birthday){
    this.name=name;
    this.birthday=birthday;
    this.manpukudo=50;
    count_Human++;
  }

  Human(){
    this("•s–¾",0);
  }

  public static int getCount_Human(){
    return count_Human;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name=name;
  }

  public int getBirthday(){
    return this.birthday;
  }

  public int setBirthday(int birthday){
    this.birthday=birthday;
  }

  public int getManpukudo(){
    return this.manpukudo;
  }

  public int setManpukudo(int manpukudo){
    this.manpukudo=manpukudo;
  }

  void eat(){
    this.manpukudo+=60;
  }
}