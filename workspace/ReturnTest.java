public class ReturnTest{
  public static void main(String[] args){
    int a =339384;
    if(isMultipleOf3(a)){
      System.out.println(a+"‚Í3‚ÅŠ„‚èØ‚ê‚Ü‚·");
    }else{
      System.out.println(a+"‚Í3‚ÅŠ„‚èØ‚ê‚Ü‚¹‚ñ");
    }
  }

  public static boolean isMultipleOf3(int n){
    boolean result;
    result=(n%3==0);
    return result;
  }
}