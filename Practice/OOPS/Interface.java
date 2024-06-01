public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


interface ChessPlayer{
    void moves(); // by default it is public and abstract
}

class Queen implements ChessPlayer{
    public void moves(){ // by default it is of default type so we need to specify it as public
        System.out.println("up,down,left,right,diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right,diagonal (by 1 steps)");
    }
}