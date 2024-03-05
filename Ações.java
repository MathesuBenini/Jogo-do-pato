import java.util.List;

public interface Ações {
    List<Integer> fire(String direcao, int alcance) throws Exception;
    void move(String direcao, int distancia) throws Exception;

}