class Employee{
  private static int number=0;
  private int code;
  private String name;
  private int year;
  private int age;

  public Employee(String name,int year,int age){
    setName(name);
    setYear(year);
    setAge(age);
    code= ++number;
  }

  public Employee(){
    this("����",0,0);
  }

  public Employee(String name){
    this(name,0,0);
  }

  public Employee (String name,int age){
    this(name,0,age);
  }

  public void display(){
    System.out.println("�Ј��ԍ��F"+code);
    System.out.println("�Ј����F"+name);
    System.out.println("���ДN���F"+year);
    System.out.println("�N��F"+age);
  }

  public void setName(String name){
    this.name=name;
  }

  public void setYear(int year){
      if(year>0){
       this.year=year;
      }
  }

  public void setAge(int age){
    if(age>0){
      this.age=age;
    }
  }

  public int getCode(){
    return code;
  }

  public String getName(){
    return name;
  }

  public int getYear(){
    return year;
  }

  public int getAge(){
    return age;
  }

  public static void showTotalNumber(){
    System.out.println("���Ј�����"+number+"�l�ł��B");
  }
}