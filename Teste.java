package Jogo;

import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        String[][] tabuleiro = new String[10][10];
        Tabuleiro jogo = new Tabuleiro(tabuleiro);
        Gobang jogo1 = new Gobang(jogo);
        Jogador preto = new Jogador("Preto", 1);
        Jogador branco = new Jogador("Branco", 2);
        System.out.println("O jogo vai comecar, veja o tabuleiro");
        jogo.imprimeTabuleiro(tabuleiro, "Tabuleiro");
        System.out.println("O jogador de pecas pretas inicia o jogo");
        int rodadas=0;

        do {
            do{

                int x, x2;

                int y, y2;

                do {
                    System.out.println("Jogador 1: Digite a coordenada x que deseja utilizar");
                    x = sc.nextInt();
                    System.out.println("Jogador 1: Digite a coordenada y que deseja utilizar");
                    y = sc.nextInt();
                    if (preto.conferirPosicaoVazia(tabuleiro, x, y) != true) {
                        System.out.println("Posicao ocupada,escolha outra coordenada x e y");
                    }
                } while (preto.conferirPosicaoVazia(tabuleiro, x, y) == false || x > 9 || y > 9);
                tabuleiro[x][y] = preto.getPeca();
                jogo.imprimeTabuleiro(tabuleiro, "Este e o tabulerio atual:");

                //vez do jogador 2
                do {
                    System.out.println("Jogador 2: Digite a coordenada x que deseja utilizar");
                    x2 = sc.nextInt();
                    System.out.println("Jogador 2: Digite a coordenada y que deseja utilizar");
                    y2 = sc.nextInt();

                    if (preto.conferirPosicaoVazia(tabuleiro, x2, y2) != true) {
                        System.out.println("Posicao ocupada,escolha outra coordenada x e y");
                    }
                } while (branco.conferirPosicaoVazia(tabuleiro, x2, y2)== false || x > 9 ||  y > 9);
                tabuleiro[x2][y2] = branco.getPeca();
                jogo.imprimeTabuleiro(tabuleiro, "Este e o tabulerio atual:");
                rodadas=rodadas+1;
            }while(rodadas<100 || (jogo.confere5posicoesiguaisnaLinha(tabuleiro) == false) || (jogo.confere5posicoesiguaisnaColuna(tabuleiro)==false));

        } while ((jogo.confereTabuleiroCheio(tabuleiro) == false) || (jogo.confere5posicoesiguaisnaLinha(tabuleiro) == false) || (jogo.confere5posicoesiguaisnaColuna(tabuleiro)==false));

    }
}
