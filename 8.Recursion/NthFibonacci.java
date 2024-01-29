public class NthFibonacci {
    public static void fib(int n,int first,int second){
        if(n==0){
            return;
        }
        //System.out.print((first+second)+" ");
        int temp = second;
        second = first + second;
        first = temp;
        fib(n-1,first,second);
        if(n==2){
            System.out.print((first+second)+" ");
        }
    }
    public static void main(String args[]){
        int n = 7;
        int first = 0;
        int second = 1;
        //System.out.print(first+" ");
        //System.out.print(second+" ");
        fib(n-2,first,second);
    }
}
