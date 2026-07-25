public class fibonacciNumber{
    public static int fib(int n){
        if (n == 0){
            return 0;
        }else if (n==1) {
            return 1;            
        }
    return fib(n-1)+ fib(n-2);
    }
    //Test Cases
    public static void main(String [] args){
        System.out.println(fib(4));
        System.out.println(fib(1));
        System.out.println(fib(5));
    }
}
