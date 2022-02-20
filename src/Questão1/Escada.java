package Questão1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String>degraus = new ArrayList<>(); //Array para laço de repetição

        System.out.println("Digite quantos degraus você quer que a escada tenha:"); //Input do usuário que guarda uma váriavel.
        int qtdDegraus = entrada.nextInt();

        // Laço de repetição que adiciona o array a quantidade de espaços e símbolos.
        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add("".repeat(qtdDegraus-i)+"*".repeat(i+1));
        }
        // Vai imprimir na tela o que foi armazenado no último laço.
        for (String d : degraus){
        System.out.println(d);

        }

    }
}
