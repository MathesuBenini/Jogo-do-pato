import java.util.ArrayList;
import java.util.List;

public class Jogador extends Pato implements Ações{
    public Jogador(int x, int y) {
        super(x, y);
    }

    @Override
    public List<Integer> fire(String direction, int alcance) throws Exception {
        
        List<Integer> points = new ArrayList<>();
        points.add(0, 0); //x
        points.add(1,0); //y

        if (direction.equals("cima")) {
            points.set(0, getX());
            points.set(1, getY() + alcance);
        }
        else if (direction.equals("baixo")) {
            points.set(0, getX());
            points.set(1, getY() - alcance);
        }
        else if (direction.equals("esquerda")) {
            points.set(0, getX() - alcance);
            points.set(1, getY());
        }
        else if (direction.equals("direita")) {
            points.set(0, getX() + alcance);
            points.set(1, getY());
        }
        else {
            throw new Exception("Direção inválida");
        }

        System.out.println("Olha o tiro...");
        return points;
    }

    @Override
    public void move(String direction, int distance) throws Exception {
        if (direction.equals("cima")) {
            setY(getY() + distance);
        }
        else if (direction.equals("baixo")) {
            setY(getY() - distance);
        }
        else if (direction.equals("esquerda")) {
            setX(getX() - distance);
        }
        else if (direction.equals("direita")) {
            setX(getX() + distance);
        }
        else {
            throw new Exception("Direção inválida");
        }

        System.out.println("jogador foi para X:" + getX() + " e Y:" + getY() + "...");

    }
}
