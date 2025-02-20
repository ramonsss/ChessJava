
public abstract class Piece {
    private String cor;

    public Piece(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract boolean validMoviment(int origemX, int origemY, int destinoX, int destinoY);
}