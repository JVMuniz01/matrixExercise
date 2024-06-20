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
public class Matriz1 {
    public static void main(String[]args){
       Scanner s = new Scanner (System .in);
       int i;
       int j;
       int[][]mat = new int [3][4];
        System.out.println("Digite numeros");
       for(i = 0; i <= mat.length - 1; i++) {
        for(j = 0; j <= mat[i].length - 1; j++) {
            mat[i][j] = s.nextInt();
    }
    }
       for(i = 0; i <= mat[0].length - 1; i++) {
           for(j = 0; j <= mat.length - 1; j++) {
               System.out.println(mat[j][i]+"");
}
System.out.println();
}
        
    }
}
