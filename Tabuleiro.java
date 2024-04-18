package Jogo;

public class Tabuleiro {

    private String[][] tabuleiro;

    public Tabuleiro(String[][] tabuleiro) {
        this.tabuleiro = new String[10][10];
    }

    public void imprimeTabuleiro(String m[][], String label) {
        System.out.println("");
        System.out.println(label + ":");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println("");

        }

    }

    public static boolean confereTabuleiroCheio(String[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                if (tabuleiro[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean confere5posicoesiguaisnaLinha(String[][] tabuleiro) {
        
        int numPosicoesIguais = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 1; j < tabuleiro.length; j++) {
                if (tabuleiro[i][j].equals(tabuleiro[i][j-1])) {
                    numPosicoesIguais = numPosicoesIguais + 1;
                }
            }
        }
        if (numPosicoesIguais == 5) {
            return true;
        }
        return false;
    }
   public static boolean confere5posicoesiguaisnaColuna(String[][] tabuleiro) {
        
        int numPosicoesIguais = 0;
        for (int j = 0; j < tabuleiro.length; j++) {
            for (int i = 1; i < tabuleiro.length; i++) {
                if(tabuleiro[i][j] == tabuleiro[i-1][j]){
                    numPosicoesIguais = numPosicoesIguais + 1;
                }
            }
        }
        if (numPosicoesIguais == 5) {
            return true;
        }
        return false;
    }
    

}
