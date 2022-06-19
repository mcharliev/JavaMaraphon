package Day_17;



public class Task_1 {
    public static void main(String[] args) {
        ChessPiece pieces [] = {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece x: pieces){
            System.out.print(x.getStringNotation() + " ");
        }

    }
}
