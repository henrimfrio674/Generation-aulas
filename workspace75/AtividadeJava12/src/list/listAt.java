package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList();
		for(int i = 0; i < 5; i++) {
			System.out.println("\nDigite as cores:");
			String cor = ler.next();
			cores.add(cor);
		}
		System.out.println("\n Suas cores :");
		for(String listaCores:cores) {
			System.out.println(listaCores);
		}
        Collections.sort(cores);
		System.out.println("\n Ordenadas :");
		for(String listaCores:cores) {
			System.out.println(listaCores);
		}
	}

}
