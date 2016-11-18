package nizBrojeva;

import java.util.ArrayList;
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

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += listaBrojeva.get(i);
		}
		System.out.println("Zbir brojeva u nizu je: " + sum);
	}

	public static void getProsjekBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += listaBrojeva.get(i);
		}
		System.out.println("Prosjek brojeva u nizu je: " + (sum / (double) (listaBrojeva.size())));
	}

	public static void getUnikatneBrojeveUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static void getSortiranNiz(ArrayList<Integer> listaBrojeva) {

	}
}
