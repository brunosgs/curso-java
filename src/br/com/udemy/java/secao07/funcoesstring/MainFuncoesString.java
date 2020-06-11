package br.com.udemy.java.secao07.funcoesstring;

public class MainFuncoesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-\n");
		System.out.println("Modificada (toLowerCase()): -" + s01 + "-");
		System.out.println("Modificada (toUpperCase()): -" + s02 + "-");
		System.out.println("Modificada (trim()): -" + s03 + "-");
		System.out.println("Modificada (substring(2)): -" + s04 + "-");
		System.out.println("Modificada (substring(2, 9)): -" + s05 + "-");
		System.out.println("Modificada (replace('a', 'x')): -" + s06 + "-");
		System.out.println("Modificada (replace(\"abc\", \"xy\")): -" + s07 + "-");
		System.out.println("Modificada (indexOf(\"bc\")): -" + i + "-");
		System.out.println("Modificada (lastIndexOf(\"bc\")): -" + j + "-");
		System.out.println("\n\n\n");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
