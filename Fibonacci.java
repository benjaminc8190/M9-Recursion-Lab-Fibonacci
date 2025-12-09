public class Fibonacci {
  public static int f(int n){
        if(n==0){
          return 0;
        } else {
          System.out.println(n+" ");
          return f(n-1) + f(n-1);
        }
    }

  public static void main(String args[]) {
    Fibonacci.f(20);
  }
}
