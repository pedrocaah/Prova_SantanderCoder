package Prova;

import java.util.Scanner;

import static java.lang.System.in;


public class Ex02 {
    public static void main(String args[]){

        Scanner sc = new Scanner(in);
        System.out.println("Digite a temperatura a ser convertida");
        double temp = sc.nextDouble();

        System.out.println("Digite a unidade de origem da temperatura");
        String unidadeOrigem = sc.next();

        System.out.println("Digite qual a unidade de destino dessa temperatura");
        String unidadeDestino = sc.next();

        double temperatura = 0.0;



        if (unidadeDestino.equals("C")){
            temperatura = (temp - 32) * 5 / 9;
            System.out.println(temp + " em ºCelsius");
        } if (unidadeDestino.equals("F")){
            temperatura = (temp * 9 / 5) + 32;
            System.out.println(temp + " em ºFahrenheit");
        } if (unidadeDestino.equals("K")){
            temperatura = 273.15 + temp;
            System.out.println(temp + " em ºKelvin");
        } else {
            System.out.println("unidade de origem da temperatura inválida");
        }
        System.out.println("A temperatura " + temp + " em " + unidadeOrigem + " convertida para " + unidadeDestino + " é: " + temperatura);

        }
    }

