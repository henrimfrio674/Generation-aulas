package Lista1;

import java.util.Scanner;

public class pesquisaVetor {
	public static void main(String[] args) {
        // Definindo o vetor com os números
        int[] vetor = {2,5,1,3,4,9,7,8,10,6};
        int repetir = 1;
        
        // Pedindo ao usuário para digitar o número a ser pesquisado
        Scanner scanner = new Scanner(System.in);
        do {
	        System.out.print("Digite o número a ser pesquisado: ");
	        int numero = scanner.nextInt();
	        
	        // Chamando o método para pesquisar o número no vetor
	        int posicao = pesquisarNumero(vetor, numero);
	        
	        // Verificando se o número foi encontrado e exibindo a posição ou mensagem de não encontrado
	        if (posicao != -1) {
	            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");

	        } else {
	            System.out.println("Não foi encontrado!");

	        }
	        System.out.print(" Gostaria de pesquisar mais? 1 para sim e 2 para não  ");
	        repetir = scanner.nextInt();
        }while(repetir != 2);
        System.out.print("\n Obrigado por participar!!");
    }
    
    // Método para pesquisar o número no vetor
    public static int pesquisarNumero(int[] vetor, int numero) {
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        // Retorna -1 se o número não for encontrado
        return -1;
    }
}
