public class HumanTest{
  public static void main(String[] args){
    
    Human human=new Human("信夫",19970101);
    System.out.println(Human.getCount_Human());
    System.out.println("名前："+human.getName());
    System.out.println("生年月日："+human.getBirthday());
    System.out.println("満腹度："+human.getManpukudo());
    human.setName("ノブ");
    
    Human human2=new Human("隆",19990909);
    System.out.println(Human.getCount_Human());
    System.out.println("名前："+human2.getName());
    System.out.println("生年月日："+human2.getBirthday());
    System.out.println("満腹度："+human2.getManpukudo());
    
    Human human3=new Human();
    System.out.println(Human.getCount_Human());
    System.out.println("名前："+human3.getName());
    System.out.println("生年月日："+human3.getBirthday());
    System.out.println("満腹度："+human3.getManpukudo());
    
    
  }
}