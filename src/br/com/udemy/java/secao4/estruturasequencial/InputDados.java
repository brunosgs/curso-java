package br.com.udemy.java.secao4.estruturasequencial;
import java.util.Locale;
import java.util.Scanner;

public class InputDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String texto;
		int numero;
		double valor;
		char letra;

		System.out.println("Digite uma frase: ");
		texto = scan.nextLine();
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		System.out.println("Digite um valor: ");
		valor = scan.nextDouble();
		System.out.println("Digite uma letra: ");
		letra = scan.next().charAt(0);

		System.out.println("A frase digitada foi: " + texto);
		System.out.println("O numero digitado foi: " + numero);
		System.out.println("O valor digitado foi: " + valor);
		System.out.println("A letra digitada foi: " + letra);

		scan.close();
	}

}
