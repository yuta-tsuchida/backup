public class calc{
  public static void main(String[] args){
    twice(667);

    powerOfTwo(5);
  }

  public static void twice(int n){
    System.out.println(n+"��2�{�́A");
    System.out.println(n*2);
  }

  public static void powerOfTwo(int n){
    int answer=1;

    for(int i=0; i<n; i++){
      answer=answer*2;
    }
    System.out.println("2��"+n+"��́A");
    System.out.println(answer);
  }
}