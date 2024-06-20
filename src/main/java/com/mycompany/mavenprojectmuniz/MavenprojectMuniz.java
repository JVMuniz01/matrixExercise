
package com.mycompany.mavenprojectmuniz;
import java.util.Scanner;
/**
 *
 * @author j040v
 */
public class MavenprojectMuniz {

    public static void main(String[] args) {
       inserir(); 
        
    }
    
    public static void inserir(){
        Scanner s = new Scanner (System.in);
        boolean retorno;
        int tam = 11;
        System.out.println("Digite 1 para digitar um CPF");
        System.out.println("Digite 2 para sair do programa");
        int opcao = s.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Digite um CPF");
                String cpf = s.next();
                retorno = validarCaracter(cpf, tam);
                    if(retorno == true){
                    System.out.println("O CPF: "+cpf+" é válido");
                }
                else{
                    System.out.println("O CPF :"+cpf+"  é inválido");
                }
                    inserir();
            case 2:
                break;
        }
            
    }
    public static boolean validarCaracter(String cpf, int tam){
        int i;
        int soma = 0;
        int soma1 = 0;
        int total = 0;
        int total1 = 0;
        int digito1;
        int digito2;
        char car;
        for(i=0;i<cpf.length();i++){
            car = cpf.charAt(i);
            if (Character.isDigit(car)== false){
                return false;
            }
                
        }
        if(cpf.length() != tam){ 
            System.out.println("O CPF não tem a quantidade certa de caracteres");
            return false;            
        }
        else{
            int vet1[] = new int[9]; 
            int multiplica = 10;
            for(i=0;i<9;i++,multiplica--){
                int num = cpf.charAt(i) -'0';
                vet1[i]=num;                 
                soma = multiplica * num;                         
                total = total + soma;               
            }
            int resto1 = total%11;
                if(resto1 < 2){
                    digito1 = 0;
                
                }else{
                    digito1 = 11 - resto1;
                                
                }
            int vet2[] = new int[10];
            int multiplica1 = 11;
            for(i=0;i<10;i++,multiplica1--){
                int num = cpf.charAt(i) -'0';
                vet2[i] = num;
                soma1 = multiplica1 * num;
                total1 = total1 + soma1;                                  
            }
            int resto2 = total1%11;            
                if(resto2 < 2){
                    digito2 = 0;
                }else{
                    digito2 = 11 - resto2;                    
                }
            if(cpf.charAt(9)-'0' != digito1){
                return false;
            }
            else if(cpf.charAt(10)-'0' !=digito2){
                return false;
            }
                            
            return true;
            
               
        }
        
    }
        
}
       
