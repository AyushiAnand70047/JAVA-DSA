public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = friendsPairing(n-1); // single
        int fnm2 = (n-1) * friendsPairing(n-2); // pair
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
      System.out.println(friendsPairing(3));  
    }
}