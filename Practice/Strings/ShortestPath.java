public class ShortestPath {
    public static float findPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        float distance = (float)Math.sqrt(x*x+y*y);
        return distance;
    }
    public static void main(String args[]){
        String directions = new String("WNEENESENNN");
        System.out.println(findPath(directions));
    }
}