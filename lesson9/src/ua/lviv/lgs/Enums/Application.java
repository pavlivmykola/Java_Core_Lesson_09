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

		System.out.println("������ ����� �����");
	
		/** input string month from emun monthes */
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		
		/** cheking if the input month is write */
		Monthes[] monthArray = Monthes.values();
		Seasons[] seasonArray = Seasons.values();
		boolean flag = false;
		for (Monthes m : monthArray) {
			if (m.name().equals(month)) {
				System.out.println("����� ����� ����");
				season = m.season;
				days = m.days;
				flag = true;
			}
		}
		if (!flag) {
			String message = "������ ����� ����";
			throw new WrongInputConsoleParametersException(message);
		}
		
		/** select the monthes from enum Monthes with season equals season.name() */
		System.out.println("̳���� � ����� ���� " + season.name());
		for (Monthes m : monthArray) {
			if (m.season.equals(season)) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days equals days */
		System.out.println("̳���� � ��������� ������� ��� " + days);
		for (Monthes m : monthArray) {
			if (m.days == days) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days less then days */
		System.out.println("̳���� � ������ ������� ��� " + days);
		for (Monthes m : monthArray) {
			if (m.days < days) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes from enum Monthes with days greater than days */
		System.out.println("̳���� � ������ ������ ��� " + days);
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
		System.out.println("�������� ���� ���� " + seasonArray[ordinal]);
		ordinal = season.ordinal() - 1;
		if (ordinal < 0) {
			ordinal = seasonArray.length - 1;
		};
		
		/** select the previous season */
		System.out.println("��������� ���� ���� " + seasonArray[ordinal]);
		System.out.println("̳���� � ������ ������� ��� ");
		for (Monthes m : monthArray) {
			if (m.days % 2 == 0) {
				System.out.println(m.name());
			}
		}
		
		/** select the monthes with the pair days */
		System.out.println("̳���� � �������� ������� ��� ");
		for (Monthes m : monthArray) {
			if (m.days % 2 == 1) {
				System.out.println(m.name());
			}
		}
		
		/** check the days in the month is pair or not */
		System.out.println((days % 2 == 0) ? "�������� ����� �� ����� ������� ���"
				: "�������� ����� �� ������� ������� ���");

	}

}
