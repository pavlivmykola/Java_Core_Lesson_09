package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws MyException {
		int a=0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ����� �����");
		if (sc.hasNextInt()) {
			a=sc.nextInt();
		} else {
			System.out.println("�� ���������� ���");
			return;
		}
		if (sc.hasNextInt()) {
			b=sc.nextInt();			
		} else {
			System.out.println("�� ���������� ���");
			
		}
		Methods m = new Methods(a,b);
		m.check();
		m.methods();
	}
}
