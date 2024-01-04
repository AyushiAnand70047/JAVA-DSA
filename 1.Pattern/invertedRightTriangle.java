import java.util.*;
public class invertedRightTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // input number of lines
        int n = sc.nextInt();
        for(int line=0;line<n;line++){
            for(int star=0;star<n-line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}