class Exercise04{
  public static void main(String[] args){
    
    Student[] students=new Student[5];
    students[0]=new Student("�D�c�M��",77,82);
    students[1]=new Student("��������",40,97);
    students[2]=new Student("��ؐ��",90,49);
    students[3]=new Student("�}����",75,81);
    students[4]=new Student("����R��",71,72);

    for(int i=0; i<5; i++){
      students[i].show();
    }

    int ktotal=0;

    int stotal=0;
    
    for(int i=0; i<students.length; i++){
      ktotal=ktotal+students[i].getKokugo();

      stotal=stotal+students[i].getSansu();
    }

    System.out.println("����̍��v��"+ktotal);
    System.out.println("���w�̍��v��"+stotal);
  }
}