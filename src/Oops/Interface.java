package Oops;

public class Interface {
    public static void main(String[] args) {
       Queen q=new Queen();
       q.moves(); 
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
       System.out.println("Moves up,down,left,right and diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Move left right up and down");
    }
}
class pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Move  up down diagonally");
    }
}
class camel implements ChessPlayer{
    public void moves(){
        System.out.println("Diagonally");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Diagonally up down left right");
    }
}
