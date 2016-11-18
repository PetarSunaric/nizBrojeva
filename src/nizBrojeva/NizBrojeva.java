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

	public static int getNajmanjiBrojUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static int getNajveciBrojUNizu(ArrayList<Integer> listaBrojeva) {

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

	public static ArrayList<Integer> getUnikatneBrojeveUNizu(ArrayList<Integer> listaBrojeva) {

	}

	public static ArrayList<Integer> getSortiranNiz(ArrayList<Integer> listaBrojeva) {

	}
}
