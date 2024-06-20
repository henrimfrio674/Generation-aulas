package ats;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar as notas
        float nota1, nota2, nota3, nota4;

        // Entrada das notas
        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        nota3 = scanner.nextFloat();

        System.out.print("Nota 4: ");
        nota4 = scanner.nextFloat();

        // Cálculo da média final
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Saída da média final
        System.out.println("\nMédia final: " + media);

        scanner.close();
    }
}
