package nizBrojeva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;


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
	public static int getNajmanjiBrojUNizu(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.sort(list);
		return list.get(0);
	}

	/* @author Jasmin Bektic */
	public static int getNajveciBrojUNizu(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.sort(list);
		return list.get(list.size());
	}

	public static int getZbirBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += listaBrojeva.get(i);
		}
		return sum;
	}

	public static double getProsjekBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += listaBrojeva.get(i);
		}
		return sum / ((double) listaBrojeva.size());
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
