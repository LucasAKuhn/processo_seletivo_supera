package TERCEIRO_DESAFIO;

import java.util.Scanner;

public class BuscarDiferencaEntreNumeros {

    public static void main(String[] args) {

        System.out.println("Valor da diferenca buscada:  ");
        Scanner entrada = new Scanner(System.in);
        int diferenca = entrada.nextInt();

        System.out.println("Tamanho do Array: ");
        int arrayTamanho = entrada.nextInt();

        int[] array = new int[arrayTamanho];

        for (int i = 0; i < arrayTamanho; i++) {
            System.out.println("Informe o " + (i + 1) + " numero do array:  ");
          array[i] = entrada.nextInt();
        }

       int totalDiferencasEncontradas = 0;

       for (int i = 0; i < arrayTamanho; i++ ) {
           for(int aux = i + 1; aux < arrayTamanho; aux++ ) {
               if (array[i] - array[aux] == diferenca || array[aux] - array[i] == diferenca) {
                   totalDiferencasEncontradas++;
               }
           }
       }

        System.out.println("O total de numeros com a diferenca solicitada eh " + totalDiferencasEncontradas);
    }

}