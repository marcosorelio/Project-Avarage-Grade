package media;

import java.util.Scanner;

public class ForNota {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int nota1, nota2, nota3;
		int media, i, contAluno = 0;

		for (i = 0; i < 3; i++) {
			contAluno++;
			System.out.println("Aluno" + contAluno + ", digite sua 1� nota");
			nota1 = ent.nextInt();

			System.out.println("Aluno" + contAluno + ", digite sua 2� nota");
			nota2 = ent.nextInt();

			System.out.println("Aluno" + contAluno + ", digite sua 3� nota");
			nota3 = ent.nextInt();

			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A m�dia do aluno" + contAluno + "�" + media);

			if ((media >= 0) && (media < 4)) {

				System.out.println("Nota E");
			} else if (media < 5) {
				System.out.println("Nota D");
			} else if (media < 7) {
				System.out.println("Nota C");
			} else if (media < 8) {
				System.out.println("Nota B");
			} else if (media < 8) {
				System.out.println("Nota A");
			}

		}

	}

}
