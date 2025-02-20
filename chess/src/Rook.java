public class Rook extends Piece {
    public Rook(String cor) {
        super(cor);
    }

    @Override
    public boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY) {
        int deltaX = Math.abs(destinoX - origemX);
        int deltaY = Math.abs(destinoY - origemY);

        return (deltaX == 0 && deltaY != 0) || (deltaX != 0 && deltaY == 0);
    }
    
    
    
    
}