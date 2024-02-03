/* Friends Pairing Problem: Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up */

public class FriendsPairingProblem {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        // single
        int fnm1 = pair(n-1);
        // pair
        int fnm2 = (n-1) * pair(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String args[]){
        System.out.println(pair(3));
    }
}
