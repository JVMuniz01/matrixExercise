/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author j040v
 */
public class matrizSorteio {
    public static void main(String[]args){
    Scanner s = new Scanner (System.in);
    int bicicleta = 5;
    int vidas = 5;
    int bomba = 5;
    int tam = 5;
    int tabuleiro[][] = new int [tam][tam];
    preencher(bicicleta,bomba,tam,tabuleiro);
    play(bicicleta,bomba,tam,tabuleiro,vidas);
    
    }
    public static void preencher(int bicicleta,int bomba, int tam, int[][]tabuleiro){
        int i,j;
        SecureRandom random = new SecureRandom();
        int bicicletaColocada = 0;
        int bombaColocada = 0;
        while(bicicletaColocada<bicicleta || bombaColocada<bomba){
            int linha = random.nextInt(tam);
            int coluna = random.nextInt(tam);
            
            if(tabuleiro[linha][coluna] == 0){
                if(bicicletaColocada<bicicleta){
                   tabuleiro[linha][coluna] = 1; 
                   bicicletaColocada++;
                }else{
                    tabuleiro[linha][coluna] = 2;
                    bombaColocada++;
                }
            }                
       }
        //Esse for é apenas para visualizar que o código está correto
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(tabuleiro[i][j]+" ");
            }
            System.out.println();
            
        }
 
    }
    public static void play(int bicicleta,int bomba, int tam, int[][]tabuleiro,int vidas){
        Scanner s = new Scanner (System.in);
        int[][] jogadaTabuleiro = new int [tam][tam];
        int bicicletasEncontradas = 0;
        for (int i = 0; i < 10; i++) {            
            System.out.println("Digite linha e coluna da jogada entre 0 e 4");
            int linha = s.nextInt();
            int coluna = s.nextInt();
            if(linha < 0 || linha > 4 ||coluna < 0 || coluna > 4){
                System.out.println("Posição inválida");
                i--;
                continue;
            }
            
            if (jogadaTabuleiro[linha][coluna] != 0) {
            System.out.println("Essa posição já foi tentada anteriormente. Tente outra posição.");
            i--;
            continue;
        }
            jogadaTabuleiro[linha][coluna] = 1;
            
            if(tabuleiro[linha][coluna] == 1){
                System.out.println("Parabens voce acertou uma bicicleta");
                bicicletasEncontradas++;
            }else if(tabuleiro[linha][coluna] == 2){
                System.out.println("Bomba voce perdeu uma vida");
                vidas--;
            }else{
                System.out.println("Você não encontrou nada");               
            }
            if(bicicletasEncontradas == 5){
                System.out.println("Parabens você ganhou o prêmio!");
                break;
            }
            if(vidas == 0 || i ==9){
                System.out.println("Voce atingiu o Limite de tentativas");
                break;
            }

        }
    }
}
