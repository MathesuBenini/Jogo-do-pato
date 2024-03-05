// Esta classe representa um pato com uma posição no plano cartesiano.
public class Pato {
    // Definem as coordenadas x e y do pato no plano cartesiano.
    private int x;
    private int y;
// Construtor da classe Pato, usado para inicializar as coordenadas x e y do pato
    public Pato(int x, int y) {
        this.x = x;
        this.y = y;
    }
 // Método para obter a coordenada x do pato.
    public int getX() {
        return x;
    }
// Método para definir a coordenada x do pato.
    public void setX(int x) {
        this.x = x;
    }
// Método para obter a coordenada y do pato.
    public int getY() {
        return y;
    }
// Método para definir a coordenada y do pato.
    public void setY(int y) {
        this.y = y;
    }
}