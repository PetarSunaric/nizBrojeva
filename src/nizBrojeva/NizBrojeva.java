package nizBrojeva;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

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
		getNajveciBrojUNizu(hash);
		getProsjekBrojevaUNizu(hash);
		getSortiranNiz(hash);
		getUnikatneBrojeveUNizu(hash);
		getZbirBrojevaUNizu(hash);
		input.close();
	}

	/* @author Jasmin Bektic */
	public static void getNajmanjiBrojUNizu(ArrayList<Integer> listaBrojeva) {
		TreeSet<Integer> set = new TreeSet<>(listaBrojeva);
		System.out.println("First number: " + set.pollFirst());
	}

	/* @author Jasmin Bektic */
	public static void getNajveciBrojUNizu(ArrayList<Integer> listaBrojeva) {
		TreeSet<Integer> set = new TreeSet<>(listaBrojeva);
		System.out.println("First number: " + set.pollLast());
	}

	public static void getZbirBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getProsjekBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getUnikatneBrojeveUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getSortiranNiz(ArrayList<Integer> listaBrojeva) {

	}
}
