public class Exercise05{
  public static void main(String[] args){
    Employee yazawa =new Employee("���@�W",5,28);
    Employee miyamoto =new Employee("�{�{�@���q",10,33);
    Employee fujiwara =new Employee("�����@���a�q",3,23);
    Employee tsuchiura =new Employee("�y�Y�@��",25,45);
    Employee nozaki =new Employee("���@�肳",18,38);
    Employee asai =new Employee("���@�^��",8,31);


    yazawa.display();
    miyamoto.display();
    fujiwara.display();
    tsuchiura.display();
    nozaki.display();
    asai.display();

    Employee.showTotalNumber();
  }
}