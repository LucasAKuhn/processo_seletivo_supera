package PRIMEIRO_DESAFIO;

import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos numeros: ");

        int qntNumeros = entrada.nextInt();

        if (qntNumeros > 1 &&  qntNumeros <= 10) {

            List<Integer> numeros = new ArrayList<>();

            for(int i = 0; i < qntNumeros; i++) {
                System.out.println("Informe a nota " + (i + 1) + ": ");
                numeros.add(entrada.nextInt());
                if (numeros.get(i) < 0) {
                    valorNegativo();
                }
            }

            var pares = numeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
            var impares = numeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            List<Integer> total = new ArrayList<>();
            total.addAll(pares);
            total.addAll(impares);
            total.forEach(System.out::println);
        } else {
            System.out.println("Numero deve ser entre 1 e 10");
        }


    }

    static void valorNegativo() {
        throw new RuntimeException("Valores nao podem ser negativos");
    }

}




