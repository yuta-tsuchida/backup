public class calc{
  public static void main(String[] args){
    twice(667);

    powerOfTwo(5);
  }

  public static void twice(int n){
    System.out.println(n+"の2倍は、");
    System.out.println(n*2);
  }

  public static void powerOfTwo(int n){
    int answer=1;

    for(int i=0; i<n; i++){
      answer=answer*2;
    }
    System.out.println("2の"+n+"乗は、");
    System.out.println(answer);
  }
}