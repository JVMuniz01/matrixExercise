/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmuniz;
import java.util.Scanner;
/**
 *
 * @author j040v
 */
public class MercadinhoDeFrutas {
    static double[][] tabela = new double[9][13];

    public static void main(String[] args) {
        // Preencher a tabela com os dados fornecidos pelo usuário
        preencherTabela();
        
        // Exibir menu de opções       
    }
    
    // Procedimento para preencher a tabela com os dados das vendas fornecidos pelo usuário
    public static void preencherTabela() {
        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Abacaxi", "Banana", "Maçã", "Mamão", "Melancia", "Melão", "Tangerina", "Uva"};
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        // Preencher a tabela por mês e por fruta
        for (int j = 0; j < meses.length; j++) {
            for (int i = 0; i < frutas.length; i++) {
                System.out.printf("Informe o valor arrecadado em %s com a venda de %s: ", meses[j], frutas[i]);
                tabela[i][j] = sc.nextDouble();
            }
        }
        
        // Preencher a linha e a coluna dos totais
        for (int i = 0; i < frutas.length; i++) {
            double totalFruta = 0;
            for (int j = 0; j < meses.length; j++) {
                totalFruta += tabela[i][j];
            }
            tabela[i][meses.length] = totalFruta; // Preencher coluna do total da fruta
        }
        for (int j = 0; j < meses.length + 1; j++) {
            double totalMes = 0;
            for (int i = 0; i < frutas.length; i++) {
                totalMes += tabela[i][j];
            }
            tabela[frutas.length][j] = totalMes; // Preencher linha do total do mês
        }
    }
    
    // Função que calcula e retorna quanto o mercadinho fatura, em média, por mês
    public static double faturamentoMedioPorMes() {
        double faturamentoMedio = 0;
        for (int j = 0; j < 12; j++) {
            faturamentoMedio += tabela[8][j];
        }
        faturamentoMedio /= 12;
        return faturamentoMedio;
    }
    
    
}
