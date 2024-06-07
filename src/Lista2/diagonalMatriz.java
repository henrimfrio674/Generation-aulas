package Lista2;
import java.util.Scanner;

public class diagonalMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Exibindo todos os elementos da diagonal principal
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        
        // Exibindo todos os elementos da diagonal secundária
        System.out.println("Elementos da diagonal secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();
        
        // Calculando a soma dos elementos da diagonal principal
        int somaDP = 0;
        for (int i = 0; i < 3; i++) {
        	somaDP += matriz[i][i];
        }
        System.out.println("Soma dos elementos da diagonal principal: " + somaDP);
        
        // Calculando a soma dos elementos da diagonal secundária
        int somaDS = 0;
        for (int i = 0; i < 3; i++) {
        	somaDS += matriz[i][2 - i];
        }
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDS);
    }
}
