package nizBrojeva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NizBrojeva {

	public static void main(String[] args) {

		ArrayList<Integer> hash = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite niz brojeva(nula prekida unos): ");
		int i = 1;
		while (i != 0) {
			try {
				i = input.nextInt();
				if(i!=0)
				hash.add(i);
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Najmanji broj u nizu je : " + getNajmanjiBrojUNizu(hash));
		System.out.println("Najveci broj u nizu je: " + getNajveciBrojUNizu(hash));
		System.out.printf("Prosjek brojeva u nizu je: %.2f\n" ,getProsjekBrojevaUNizu(hash));
		System.out.println("Zbir brojeva u nizu je: " + getZbirBrojevaUNizu(hash));
		ArrayList<Integer> sortiraniNiz = getSortiranNiz(hash);
		ArrayList<Integer> unikatniNiz = getUnikatneBrojeveUNizu(hash);
		System.out.println("Sortirani brojevi: ");
		for (int j : sortiraniNiz) {
			System.out.print(j + " ");
		}
		System.out.println("\nUnikatni niz brojeva: ");
		for (int j : unikatniNiz) {
			System.out.print(j + " ");
		}
		input.close();
	}

	/* @author Jasmin Bektic */
	public static int getNajmanjiBrojUNizu(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(listaBrojeva);
		Collections.sort(list);
		return list.get(0);
	}

	/* @author Jasmin Bektic */
	public static int getNajveciBrojUNizu(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(listaBrojeva);
		Collections.sort(list);
		return list.get(list.size() - 1);
	}

	public static int getZbirBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += i;
		}
		return sum;
	}

	public static double getProsjekBrojevaUNizu(ArrayList<Integer> listaBrojeva) {

		int sum = 0;
		for (int i : listaBrojeva) {
			sum += i;
		}
		return sum / ((double) (listaBrojeva.size() - 1));
	}

	/**
	 * @author AonoZan Dejan Petrovic 2016 ©
	 */
	public static ArrayList<Integer> getUnikatneBrojeveUNizu(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(listaBrojeva);
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>(newList);
		newList.clear();
		uniqueNumbers.forEach(number -> newList.add(number));
		return newList;
	}

	/**
	 * @author AonoZan Dejan Petrovic 2016 ©
	 */
	public static ArrayList<Integer> getSortiranNiz(ArrayList<Integer> listaBrojeva) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(listaBrojeva);
		Collections.sort(newList);
		return newList;
	}
}
