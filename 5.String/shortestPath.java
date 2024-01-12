/* Given a route containing 4 directions (E,W,N,S), find the shortest path to reach destination. */
import java.util.*;
public class shortestPath {
    public static void findShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
        }
        float displacement = (float)Math.sqrt(x*x+y*y);
        System.out.println(displacement);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        findShortestPath(path);
    }
}
