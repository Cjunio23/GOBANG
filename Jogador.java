
package Jogo;

/**
 *
 * @author laura
 */
public class Jogador {
    String peca;
    int [][] proximasJogadas= new int[4][4];
    

    public Jogador(String peca, int vez) {
        this.peca = peca;
        
    }

   
    
    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public int[][] getProximasJogadas() {
        return proximasJogadas;
    }

    public void setProximasJogadas(int[][] proximasJogadas) {
        this.proximasJogadas = proximasJogadas;
    }
    
    public boolean conferirPosicaoVazia(String [][] tabuleiro, int x,int y){
                if(tabuleiro[x][y]==null){
                return true;
                }
      return false;
    }
    
   
    
    
    
}
