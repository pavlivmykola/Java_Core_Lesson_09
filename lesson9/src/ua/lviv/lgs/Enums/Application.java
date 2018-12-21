/*
 * Logos IT Academy 2018
 */
package ua.lviv.lgs.Enums;

import java.util.Scanner;

import ua.lviv.lgs.Enums.WrongInputConsoleParametersException;
/** 
 * The {@code String} class represents string
 * @author Mykola Pavliv
 * @since JDK 1.8
 * @version 1.0
 */
public class Application {

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Seasons season = null;
		int days = 0;

		System.out.println("¬вед≥ть назву м≥с€ц€");
	
		/** input string month from emun monthes */
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		
		/** cheking if the input month is write */
		Monthes[] monthArray = Monthes.values();
		Seasons[] seasonArray = Seasons.values();
		boolean flag = false;
		for (Monthes m : monthArray) {
			if (m.name().equals(month)) {
				System.out.println("“акий м≥с€ць ≥снуЇ");
				season = m.season;
				days = m.days;
				flag = true;
			}
		}
		if (!flag) {
			String message = "“акого м≥с€ц€ немаЇ";
			throw new WrongInputConsoleParametersException(message);
		}
		
		/** select the monthes from enum Monthes with season equals season.name() */
		System.out.println("ћ≥с€ц≥ з порою року " + season.name());
		for (Monthes m : monthArray) {
			if (m.season.equals(season)) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days equals days */
		System.out.println("ћ≥с€ц≥ з однаковою к≥льк≥стю дн≥в " + days);
		for (Monthes m : monthArray) {
			if (m.days == days) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days less then days */
		System.out.println("ћ≥с€ц≥ з меншою к≥льк≥стю дн≥в " + days);
		for (Monthes m : monthArray) {
			if (m.days < days) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days greater than days */
		System.out.println("ћ≥с€ц≥ з меншою б≥льшою дн≥в " + days);
		for (Monthes m : monthArray) {
			if (m.days > days) {
				System.out.println(m.name());
			}
		}
		
		/** select the next season */
		int ordinal = 1 + season.ordinal();
		if (ordinal == seasonArray.length) {
			ordinal = 0;
		}
		;
		System.out.println("Ќаступна пора року " + seasonArray[ordinal]);
		ordinal = season.ordinal() - 1;
		if (ordinal < 0) {
			ordinal = seasonArray.length - 1;
		};
		
		/** select the previous season */
		System.out.println("ѕопередн€ пора року " + seasonArray[ordinal]);
		System.out.println("ћ≥с€ц≥ з парною к≥льк≥стю дн≥в ");
		for (Monthes m : monthArray) {
			if (m.days % 2 == 0) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes with the pair days */
		System.out.println("ћ≥с€ц≥ з непарною к≥льк≥стю дн≥в ");
		for (Monthes m : monthArray) {
			if (m.days % 2 == 1) {
				System.out.println(m.name());
			}
		}
		
		/** check the days in the month is pair or not */
		System.out.println((days % 2 == 0) ? "¬ведений м≥с€ць маЇ парну к≥льк≥сть дн≥в"
				: "¬ведений м≥с€ць маЇ непарну к≥льк≥сть дн≥в");

	}

}
