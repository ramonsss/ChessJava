
public class Rei extends Piece {
    public Rei(String cor) {
        super(cor);
    }

    @Override
    public boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY) {
        return Math.abs(destinoX - origemX) <= 1 && Math.abs(destinoY - origemY) <= 1;
    }

}
