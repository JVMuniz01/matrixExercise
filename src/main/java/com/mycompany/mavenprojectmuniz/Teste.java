/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmuniz;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] A = new double[3][4];
        double[][] B = new double[3][4];
        double[][] C = new double[3][4];
        
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = s.nextDouble();
            }
        }
               
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = s.nextDouble();
            }
        }
               
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
                
        System.out.println("A soma das matrizes A e B é: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}