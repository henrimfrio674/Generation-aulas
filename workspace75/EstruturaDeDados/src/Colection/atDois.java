package Colection;

import java.util.ArrayList;
import java.util.Scanner;

public class atDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		do {
			System.out.println("\n Opções do estoque ");
			System.out.println("\n(1) Adicionar");
			System.out.println("\n(2) Remover");
			System.out.println("\n(3) Atualiza");
			System.out.println("\n(4) Mostrar");
			System.out.println("\n(0) Encerrar programa");
			System.out.println("\n Digite sua escolha:");
			op = ler.nextInt();
		}while(op != 0);
		switch(op) {
		case 1:
			ler.nextLine();
			System.out.println("\nDigite o produto para o estoque:");
			String produto = ler.nextLine();
			estoque.add(produto);
			break;
		case 2:
			ler.nextLine();
			System.out.println("\nDigite o produto para deletar o estoque:");
			String produtor = ler.nextLine();
			if(estoque.contains(produtor)) {
				estoque.remove(produtor);
			}else {
				System.out.println("\n Produto não existe");
			}
			break;
		case 3:
			ler.nextLine();
			System.out.println("\nDigite o produto para atualiza");
			String verifica = ler.nextLine();
			System.out.println("Digite a atualização");
			String novo = ler.nextLine();
			if(estoque.contains(verifica)) {
				estoque.remove(verifica);
				estoque.add(novo);
			}else {
				System.out.println("\n Produto não existe");
			}
			break;
		}
	}

}
