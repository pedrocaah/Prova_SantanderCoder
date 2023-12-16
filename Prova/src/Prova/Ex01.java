package Prova;

import java.util.Scanner;

public class Ex01 {
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo ao Banco Coder Tank, digite o valor de empréstimo desejado: R$\n");
            int valorEmprestimo = sc.nextInt();
            System.out.println("Para o valor desejado, a taxa de juros é: " + valorEmprestimo);
            int taxaJuros = sc.nextInt();
            System.out.println("O prazo para para pagamento é de:" + taxaJuros);
            int meses = sc.nextInt();

            double jurosTotal = taxaJuros * valorEmprestimo;
            double totalSaldoDevedor = valorEmprestimo + valorEmprestimo*taxaJuros/100;
            double amortizacao = totalSaldoDevedor / meses;
            double jurosMensal = taxaJuros / meses;
            double parcelaMensal = jurosMensal * amortizacao;
            double saldoDevedorAtual = totalSaldoDevedor - parcelaMensal;

        System.out.printf("Valor da amortização: R$ %.2f | Saldo devedor total é: %.2f | Com taxa de juros mensal de: %.2f%n", amortizacao, totalSaldoDevedor, jurosMensal);

        System.out.printf("Parcela 1 | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n", jurosMensal, parcelaMensal,saldoDevedorAtual);

        //Não peguei bem o método com for, consegui com essa lógica, porém como o enunciado pede para digitar quantidade de parcela não sei
        //como desenvolver a lógica para imprimir o restante das parcelas.

        System.out.printf("Valor total do empréstimo: %.2f | Juros total aplicado: %.2f | Amortização: %d", totalSaldoDevedor, jurosTotal, valorEmprestimo);
        }
    }

