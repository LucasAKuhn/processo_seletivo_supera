package QUARTO_DESAFIO;

import java.util.Scanner;

public class meuCodigo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de textos desejados: ");
        int numeroDeFrases = entrada.nextInt();

        for (int aux = 0; aux < numeroDeFrases; aux++) {
            System.out.println("Informe a frase " + (aux + 1) + ":");
            String frase = lerLinha(entrada);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2);
        }
    }

        public static String lerLinha(Scanner entrada) {
            String linha = entrada.nextLine();
            while (linha.isEmpty())
                linha = entrada.nextLine();
            return linha;
        }
}
