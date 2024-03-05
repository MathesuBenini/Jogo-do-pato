import java.util.List;

public class Main {
    public static void main(String[] args) {// Cria os alvos e o jogador
        Alvo target = new Alvo(10, 20);
        Alvo2 target2 = new Alvo2(10, 30);
        Jogador player = new Jogador(0, 10);

        // Mostra a posição inicial dos alvos e do jogador
        System.out.println("Os alvos estão na posicão:\n");
        System.out.println("Alvo - X:" + target.getX() + " Y:" + target.getY());
        System.out.println("Alvo - X:" + target2.getX() + "Y:" + target2.getY());
        System.out.println("O jogador esta na posicão:\n");
        System.out.println("Jogador - X:" + player.getX() + " Y:" + player.getY());
        System.out.println();
        System.out.println("----------INICIO DO JOGO!!!----------\n\n");

        try {
            player.move("cima", 10); // indicar para onde o jogador vai se mover

            List<Integer> fire = player.fire( "direita",10); //indicar direcao e a distancia do tiro
            // Verifica se o tiro acertou o alvo 1
            if (fire.get(0) == target.getX() && fire.get(1) == target.getY()) {
                System.out.println("Acertou o pato 1!!");
                target.setVivo(false); //marca o alvo 1 como abatido
            }
            else {
                System.out.println("Errou");
            }

                
            System.out.println();
            //verifica e printa se o alvo 1 foi ou não abatido
            // if (!alvo.isVivo()) {
            //     System.out.println("Acertou o pato 1!!\n");
            // }
            // else {
            //     System.out.println("Vixi...Você não acertou o Pato1\n");
            // }

        
            player.move("cima", 10);// indicar para onde o jogador vai se mover


            fire = player.fire( "direita",10);//indicar direcao e a distancia do tiro
            // Verifica se o tiro acertou o alvo 2
            if ((fire.get(0) == target2.getX() && fire.get(1) == target2.getY())) {
                System.out.println("Acertou o pato 2!!");
                target2.setVivo(false);//marca o alvo 2 como abatido
            }
            else {
                System.out.println("Errou");
            }


            System.out.println();

            if (!target2.isVivo() && !target.isVivo()) {//verifica e printa se o alvo foi ou não abatido
                System.out.println("Parabéns você venceu o jogo!!");
            }
            else if (!target2.isVivo() && target.isVivo()) {
                System.out.println("Pato 1 ainda está vivo");
            }
            else if (target2.isVivo() && !target.isVivo()) {
                System.out.println("Pato 2 ainda está vivo");
            }else{
                System.out.println("Ambos os patos ainda estão vivos");
            }

        } catch (Exception e) { //mostra uma mensagem de erro se ocorrer algo
            System.out.println(e.getMessage());
        }



    }
}