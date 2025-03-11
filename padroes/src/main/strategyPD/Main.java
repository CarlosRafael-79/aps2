package main.strategyPD;

import main.strategyPD.contextVariant.Livro;
import main.strategyPD.strategy.TipoCapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Qual livro deseja comprar? ");
        String nome = scanner.nextLine();

        System.out.println("Qual valor dele? ");
        double valor = scanner.nextDouble();

        System.out.println("Escolha o tipo de capa:\n1 - Ebook\n2 - Normal\n3 - Dura");
        int opcao = scanner.nextInt();
        Capas capas = Capas.values()[opcao-1];

        Livro livro = new Livro(nome,valor,capas.obterTipoCapa());
        livro.exibirInfo();

    }
}
