public class ReturnTest{
  public static void main(String[] args){
    int a =339384;
    if(isMultipleOf3(a)){
      System.out.println(a+"��3�Ŋ���؂�܂�");
    }else{
      System.out.println(a+"��3�Ŋ���؂�܂���");
    }
  }

  public static boolean isMultipleOf3(int n){
    boolean result;
    result=(n%3==0);
    return result;
  }
}