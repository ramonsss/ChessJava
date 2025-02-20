public class Pawn extends Piece {
    public Pawn(String cor) {
        super(cor);
    }

    @Override
    public boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY) {
        if (this.getCor().equals("Branca")) {
            if (origemX == 1) {
                if (destinoX == origemX + 1 && destinoY == origemY) {
                    return true;
                } else if (destinoX == origemX + 2 && destinoY == origemY) {
                    return true;
                }
            } else {
                if (destinoX == origemX + 1 && destinoY == origemY) {
                    return true;
                }
            }
        } else {
            if (origemX == 6) {
                if (destinoX == origemX - 1 && destinoY == origemY) {
                    return true;
                } else if (destinoX == origemX - 2 && destinoY == origemY) {
                    return true;
                }
            } else {
                if (destinoX == origemX - 1 && destinoY == origemY) {
                    return true;
                }
            }
        }
        return false;
    }

}
