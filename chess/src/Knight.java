public class Knight extends Piece {
    public Knight(String cor) {
        super(cor);
    }

    @Override
    public boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY) {
        int deltaX = Math.abs(destinoX - origemX);
        int deltaY = Math.abs(destinoY - origemY);

        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
}