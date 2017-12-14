public class Exercise05{
  public static void main(String[] args){
    Employee yazawa =new Employee("矢沢　晃",5,28);
    Employee miyamoto =new Employee("宮本　純子",10,33);
    Employee fujiwara =new Employee("藤原　美和子",3,23);
    Employee tsuchiura =new Employee("土浦　功",25,45);
    Employee nozaki =new Employee("野崎　りさ",18,38);
    Employee asai =new Employee("浅井　真治",8,31);


    yazawa.display();
    miyamoto.display();
    fujiwara.display();
    tsuchiura.display();
    nozaki.display();
    asai.display();

    Employee.showTotalNumber();
  }
}