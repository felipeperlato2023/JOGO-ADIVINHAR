package jogo;

import java.util.Scanner;
import java.util.Random;

public class Program {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Random random = new Random();

		int numero = random.nextInt(1000);

		System.out.println("informe o numero entre 1 e 1000");
		int num = ler.nextInt();
		if (num == numero) {
			System.out.println(" -- Parabens vc acertou --");
			System.out.println(" -- Fim!--");

		}

		while (num != numero) {
			System.out.println(" informe outro numero");
			int outro = ler.nextInt();
			if (outro < numero) {
				System.out.println("O numero correto é maior");

			}

			else if (outro > numero) {
				System.out.println("O numero correto é menor");
			}

			else if (outro == numero) {
				System.out.println(" -- Parabens vc acertou --");
				System.out.println(" -- Fim!--");
				break;
			}
		}

	}

}
