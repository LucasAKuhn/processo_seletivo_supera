package SEGUNDO_DESAFIO;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        System.out.println("Digite o valor total que sera convertido: ");
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        double valorTotal = entrada.nextDouble();

        if(valorTotal < 0) {
            valorNegativo();
        }

         double nota100 = 100.00;
         int qntNota100 = 0;
         double nota50 = 50.00;
         int qntNota50 = 0;
         double nota20 = 20.00;
         int qntNota20 = 0;
         double nota10 = 10.00;
         int qntNota10 = 0;
         double nota5 = 5.00;
         int qntNota5 = 0;
         double nota2 = 2.00;
         int qntNota2 = 0;

         double moeda1 = 1.00;
         int qntMoeda1 = 0;
         double moeda50 = 0.50;
         int qntMoeda50 = 0;
         double moeda25 = 0.25;
         int qntMoeda25 = 0;
         double moeda10 = 0.10;
         int qntMoeda10 = 0;
         double moeda5 = 0.05;
         int qntMoeda5 = 0;
         double moeda01 = 0.01;
         int qntMoeda01 = 0;



        while(valorTotal >= nota100) {
            valorTotal -= nota100;
            qntNota100++;

        } while (valorTotal >= nota50) {
            valorTotal -= nota50;
            qntNota50++;

        } while (valorTotal >= nota20) {
            valorTotal -= nota20;
            qntNota20++;

        } while (valorTotal >= nota10) {
            valorTotal -= nota10;
            qntNota10++;

        } while (valorTotal >= nota5) {
            valorTotal -= nota5;
            qntNota5++;

        } while (valorTotal >= nota2) {
            valorTotal -= nota2;
            qntNota2++;
        }
            //MOEDA
        while(valorTotal >= moeda1) {
            valorTotal -= moeda1;
            qntMoeda1++;

        } while (valorTotal >= moeda50) {
            valorTotal -= moeda50;
            qntMoeda50++;

        } while (valorTotal >= moeda25) {
            valorTotal -= moeda25;
            qntMoeda25++;

        } while (valorTotal >= moeda10) {
            valorTotal -= moeda10;
            qntMoeda10++;

        } while (valorTotal >= moeda5) {
            valorTotal -= moeda5;
            qntMoeda5++;

        } while (valorTotal > moeda01) {
            valorTotal -= moeda01;
            qntMoeda01++;
        }


        System.out.println("NOTAS:");
        System.out.println(qntNota100 + " nota(s) de R$ 100.00");
        System.out.println(qntNota50 + " nota(s) de R$ 50.00");
        System.out.println(qntNota20 + " nota(s) de R$ 20.00");
        System.out.println(qntNota10 + " nota(s) de R$ 10.00");
        System.out.println(qntNota5 + " nota(s) de R$ 5.00");
        System.out.println(qntNota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(qntMoeda1 + " moeda(s) de R$ 1.00");
        System.out.println(qntMoeda50 + " moeda(s) de R$ 0.50");
        System.out.println(qntMoeda25 + " moeda(s) de R$ 0.25");
        System.out.println(qntMoeda10 + " moeda(s) de R$ 0.10");
        System.out.println(qntMoeda5 + " moeda(s) de R$ 0.05");
        System.out.println(qntMoeda01 + " moeda(s) de R$ 0.01");

    }

    static void valorNegativo() {
        throw new RuntimeException("Valores nao podem ser negativos");
    }
}
