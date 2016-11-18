package nizBrojeva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedSet;

public class NizBrojeva {

	static ArrayList<Integer> hash = new ArrayList<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite niz brojeva(nula prekida unos): ");
		int i = 1;
		while (i != 0) {
			try {
				i = input.nextInt();
				hash.add(i);
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
		getNajmanjiBrojUNizu(hash);
		getNajveciBrojUNizu(null);
		getProsjekBrojevaUNizu(hash);
		getSortiranNiz(hash);
		getUnikatneBrojeveUNizu(hash);
		getZbirBrojevaUNizu(hash);
		input.close();
	}

	public static void getNajmanjiBrojUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getNajveciBrojUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getZbirBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getProsjekBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

	}

	/** @author AonoZan Dejan Petrovic 2016 © */
	public static void getUnikatneBrojeveUNizu(ArrayList<Integer> listaBrojeva) {
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>(hash);
		System.out.print("Svi jedinstveni brojevi su: ");
		uniqueNumbers.forEach(number -> System.out.print(number + " "));
		System.out.println();
	}

	/** @author AonoZan Dejan Petrovic 2016 © */
	public static void getSortiranNiz(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(hash);
		Collections.sort(newList);
		System.out.print("lista brojeva sortirana: ");
		newList.forEach(number -> System.out.print(number + " "));
		System.out.println();
	}
}
