import java.util.*;
public class rightTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Right Triangular Pattern
        System.out.print("Enter number of line: ");
        int n = sc.nextInt();
        // iterate loop over n row
        for(int line=0;line<n;line++){
            // iterate loop over column such that ith row is having i number of star
            for(int star=0;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}