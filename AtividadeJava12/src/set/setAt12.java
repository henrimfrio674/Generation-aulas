package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setAt12 {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = ler.nextInt();
            integerSet.add(num);
        }


        ler.nextLine(); 


        System.out.print("Digite um número inteiro para verificar: ");
        int userInput;
        try {
            userInput = Integer.parseInt(ler.nextLine());


            if (integerSet.contains(userInput)) {
                System.out.println("Número " + userInput + " Encontrado!");
            } else {
                System.out.println("O número " + userInput + " não foi encontrado!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
        } finally {

            ler.close();
        }
    }
}
