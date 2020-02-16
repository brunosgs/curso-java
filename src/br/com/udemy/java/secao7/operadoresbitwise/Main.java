package br.com.udemy.java.secao7.operadoresbitwise;

import java.util.Scanner;

/**
 * Utilizado esse tipo de programação para interfaces de rede ou micro
 * controladores. Para uma programação de baixo nível.
 * 
 * @author bruno
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		int mask = 0b100000;
		
		int n = scan.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		scan.close();
	}
}
