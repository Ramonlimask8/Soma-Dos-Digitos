package somadosdigitos;

import java.util.Scanner;

public class SomaDosDigitos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   int soma = 0;
            System.out.println("Numero:  ");
            String n = leitor.nextLine();
         
                for (int i = 0; i < n.length();i++) { 
            String d = n.substring(i,i+1);
            int di = Integer.parseInt(d);
        soma = soma +di;
                }
                    System.out.println("Soma: " +soma );
                    
                
                }

    }

