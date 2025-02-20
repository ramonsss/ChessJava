public class Bispo extends Piece {
    public Bispo(String cor) {
        super(cor);
    }

    @Override
    public boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY) {
        
        int deltaX = Math.abs(destinoX - origemX);
        int deltaY = Math.abs(destinoY - origemY);

        return deltaX == deltaY;
    }
    
}
