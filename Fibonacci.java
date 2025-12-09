public class Fibonacci {
  public static int f(int n){
        if(n==0){
            System.out.print(n+ " ");
            return 0;
        } else if(n==1){
            System.out.print(n+ " ");
            return 1;
        } else{
            System.out.print(n+ " ");
            return f(n-1) + f(n-2);
        }
    }
    //F(0) = 0,   F(1) = 1,  and  F(n) = F(n-1) + F(n-2) for any n >=2

  public static void main(String args[]) {
    Fibonacci.f(20);
  }
}
