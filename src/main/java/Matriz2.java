
import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {
        double[][] tabela = new double[9][13];
        String[] frutas = {"Abacaxi", "Banana", "Maca", "Mamao", "Melancia", "Melao", "Tangerina", "Uva"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        preencher(tabela, frutas, mes);
        opcoes(tabela, frutas, mes);
    }

    public static void preencher(double[][] tabela, String[] frutas, String[] mes) {
        Scanner s = new Scanner(System.in);
        int i, j;
        for (i = 0; i < mes.length; i++) {
            for (j = 0; j < frutas.length; j++) {
                System.out.println(frutas[j] + "  No mês :" + mes[i]);
                tabela[j][i] = s.nextDouble();
            }
        }
        for (i = 0; i < frutas.length; i++) {
            double somaFatura = 0;
            for (j = 0; j < mes.length; j++) {
                somaFatura = somaFatura + tabela[i][j];
            }
            tabela[i][12] = somaFatura;
        }
        for (i = 0; i < mes.length; i++) {
            double somaQtd = 0;
            for (j = 0; j < frutas.length; j++) {
                somaQtd = somaQtd + tabela[j][i];
            }
            tabela[8][i] = somaQtd;
        }

    }

    public static void opcoes(double[][] tabela, String[] frutas, String[] mes) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a ação desejada");
        System.out.println("1 - Saber a média da fatura por mês");
        System.out.println("2 - Faturamento anual de determinada fruta");
        System.out.println("3 - Faturamento em um determinado mês");
        System.out.println("4 - Faturamento anual do mercadinho");
        System.out.println("5 - Finalizar programa");
        int choice = s.nextInt();
        if (choice < 1 || choice > 5) {
            System.out.println("Opção inválida, tente novamente uma opção válida");
            opcoes(tabela, frutas, mes);
        }
        switch (choice) {

            case 1:
                double mediaDoMes = mediaMes(tabela, frutas, mes);
                System.out.println(mediaDoMes);
                opcoes(tabela, frutas, mes);

            case 2:
                double totalFrutaAnual = faturaAnualFruta(tabela, frutas, mes);
                System.out.println(totalFrutaAnual);
                opcoes(tabela, frutas, mes);

            case 3:
                double faturaMesSelect = faturaMes(tabela, frutas, mes);
                System.out.println(faturaMesSelect);
                opcoes(tabela, frutas, mes);
            case 4:
                double totalAnual = faturamentoAnual(tabela, frutas, mes);
                System.out.println(totalAnual);
                opcoes(tabela, frutas, mes);
            case 5:
                break;

        }
    }

    public static double mediaMes(double[][] tabela, String[] frutas, String[] mes) {
        int i;
        double somaMeses = 0;
        for (i = 0; i < mes.length; i++) {
            somaMeses = somaMeses + tabela[8][i];
        }
        double mediaMeses = somaMeses / mes.length;
        System.out.println("A fatura média do mercadinho foi de: " + mediaMeses);
        return mediaMeses;
    }

    public static double faturaAnualFruta(double[][] tabela, String[] frutas, String[] mes) {
        Scanner s = new Scanner(System.in);
        int i, j;
        double somaAnualFruta = 0;
        System.out.println("Digite o nome da fruta para verificar seu faturamento anual");
        String nomeFruta = s.next();
        for (i = 0; i < frutas.length; i++) {
            if (nomeFruta.equals(frutas[i])) {
                for (j = 0; j < mes.length; j++) {
                    somaAnualFruta = somaAnualFruta + tabela[i][j];
                }
            }
        }
        return somaAnualFruta;
    }

    public static double faturaMes(double[][] tabela, String[] frutas, String[] mes) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Qual mês você que ver a fatura?");
        System.out.println("1-Janeiro, 2-Fevereiro 3-Março e assim sucessivamente");
        double somaMensal = 0;
        int faturaDoMes = s.nextInt();
        while (faturaDoMes < 1 || faturaDoMes > 12) {
            System.out.println("Opção inválida, tente novamente uma opção válida");
            faturaDoMes = s.nextInt();
        }
        for (i = 0; i < frutas.length; i++) {
            somaMensal = somaMensal + tabela[i][faturaDoMes - 1];
        }
        return somaMensal;

    }

    public static double faturamentoAnual(double[][] tabela, String[] frutas, String[] mes) {
        int i;
        double somaAnualMercadinho = 0;
        for (i = 0; i < frutas.length; i++) {
            somaAnualMercadinho = somaAnualMercadinho + tabela[i][mes.length];

        }
        return somaAnualMercadinho;
    }

}
