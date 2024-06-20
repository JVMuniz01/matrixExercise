
import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas linhas terá sua matriz?");
        int linhas = s.nextInt();
        System.out.println("Quantas colunas terá sua matriz?");
        int colunas = s.nextInt();

        int[][] matrizA = new int[linhas][colunas];

        preencher(matrizA, linhas, colunas);
        int matrizB[][] = matrizTransposta(matrizA, linhas, colunas);
        opcoes(matrizA, matrizB, linhas, colunas);
    }

    public static void preencher(int[][] matrizA, int linhas, int colunas) {
        Scanner s = new Scanner(System.in);
        int i, j;
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                System.out.println("Preencha sua matriz");
                System.out.println("A[" + i + "][" + j + "]");
                matrizA[i][j] = s.nextInt();
            }
        }

    }

    public static int[][] matrizTransposta(int[][] matrizA, int linhas, int colunas) {
        int i, j;
        int[][] matrizTransposta = new int[colunas][linhas];
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matrizA[i][j];               
            }            
        }
        return matrizTransposta;
    }

    public static void opcoes(int[][] matrizA, int[][] matrizB, int linhas, int colunas) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite qual matriz deseja visualizar");
        System.out.println("1 - para visualizar a matriz original");
        System.out.println("2 - para visualizar a matriz transposta");
        System.out.println("3 - para finalizar operação");


        int opcoes = s.nextInt();
        while (opcoes < 1 || opcoes > 3) {
            System.out.println("opcao invalida digite outra");
            opcoes = s.nextInt();
        }
        switch (opcoes) {
            case 1:
                for (i = 0; i < linhas; i++) {
                    for (j = 0; j < colunas; j++) {
                        System.out.println(matrizA[i][j] + " ");
                    }
                    System.out.println();
                }
                opcoes(matrizA, matrizB, linhas, colunas);

            case 2:
                for (i = 0; i < matrizB.length; i++) {
                    for (j = 0; j < matrizB[0].length; j++) {
                        System.out.println(matrizB[i][j] + " ");
                    }
                    System.out.println();
                }
                opcoes(matrizA, matrizB, linhas, colunas);
                
            case 3:
                break;
        }
    }
}
