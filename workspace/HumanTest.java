public class HumanTest{
  public static void main(String[] args){
    
    Human human=new Human("�M�v",19970101);
    System.out.println(Human.getCount_Human());
    System.out.println("���O�F"+human.getName());
    System.out.println("���N�����F"+human.getBirthday());
    System.out.println("�����x�F"+human.getManpukudo());
    human.setName("�m�u");
    
    Human human2=new Human("��",19990909);
    System.out.println(Human.getCount_Human());
    System.out.println("���O�F"+human2.getName());
    System.out.println("���N�����F"+human2.getBirthday());
    System.out.println("�����x�F"+human2.getManpukudo());
    
    Human human3=new Human();
    System.out.println(Human.getCount_Human());
    System.out.println("���O�F"+human3.getName());
    System.out.println("���N�����F"+human3.getBirthday());
    System.out.println("�����x�F"+human3.getManpukudo());
    
    
  }
}