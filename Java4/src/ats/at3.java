package ats;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar os dados do colaborador
        float salarioBruto, adicionalNoturno, horasExtras, descontos;

        // Entrada dos dados
        System.out.print("Salário Bruto: ");
        salarioBruto = scanner.nextFloat();

        System.out.print("Adicional Noturno: ");
        adicionalNoturno = scanner.nextFloat();

        System.out.print("Horas Extras: ");
        horasExtras = scanner.nextFloat();

        System.out.print("Descontos: ");
        descontos = scanner.nextFloat();

        // Cálculo do salário líquido
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        // Saída do salário líquido
        System.out.println("\nSalário Líquido: " + salarioLiquido);

        scanner.close();
    }
}
