package ListaDeExercicio01_Exercicio14;

import java.util.Scanner;

public class TestaExercicio14 {

    public static void main(String[] args) {

        Scanner numeroPrimo = new Scanner(System.in);
       // numeroPrimo.useDelimiter("\n");
        System.out.print("Digite um n�mero:");
        int index = numeroPrimo.nextInt();

        Boolean flag = NumeroPrimo.IsPrimo(index);

        if (flag==Boolean.TRUE) {
            System.out.println("O n�mero " +index + " � primo");
        }else{
            System.out.println("O n�mero " +index + " n�o � primo");
        }
        
        numeroPrimo.close();
        
    }


}


