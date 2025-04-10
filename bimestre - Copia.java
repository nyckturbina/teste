import java.util.Scanner;

public class bimestre{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
        System.out.print ("escreva a nota do 1° bimestre; ");
        int número = scanner.nextInt();


        System.out.print("escreva a nota do 2° bimestre; " +número );
        int número2 = scanner.nextInt();


       System.out.print("escreva nota do 3° bimestre; " +número2);
       int número3 = scanner.nextInt();

       System.out.print("escreva nota do 4° bimestre; " +número3 );
       int número4 =scanner.nextInt();

       int soma = número + número2 + número3 + número4; 
       
       int divisão = soma/4;

       System.out.print("a média do aluno " + número + "," + número2 +"," + número3 + "," + número4 + "é:" +divisão);


       if (divisão >= 7 ){
           System.out.print("você esta aprovado. Parabéns!");
       }  else {
            System.out.print("você não passou por media.");
       }


       scanner.close();

        
    
       
    }
}
