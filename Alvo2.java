public class Alvo2 extends Pato{
    private boolean isAlive;
    public Alvo2(int x, int y) {
        super(x, y);
        this.isAlive = true;
    }

    public boolean isVivo() {
        return isAlive;
    }

    public void setVivo(boolean vivo) {
        this.isAlive = vivo;
    }
    
}