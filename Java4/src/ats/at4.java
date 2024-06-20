package ats;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar os números
        float n1, n2, n3, n4;

        // Entrada dos números
        System.out.print("numero1: ");
        n1 = scanner.nextFloat();

        System.out.print("numero2: ");
        n2 = scanner.nextFloat();

        System.out.print("numero3: ");
        n3 = scanner.nextFloat();

        System.out.print("numero4: ");
        n4 = scanner.nextFloat();

        // Cálculo da diferença entre os produtos
        float diferenca = (n1 * n2) - (n3 * n4);

        // Saída da diferença calculada
        System.out.println("\nDiferença: " + diferenca);

        scanner.close();
    }
}
