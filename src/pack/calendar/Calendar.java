package pack.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		//직접 입력
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력
		System.out.println();
		
		System.out.println("어떤 달의 최대 일수를 구하고 싶어?");
		Scanner scanner = new Scanner(System.in);
		//int a = scanner.nextInt();
		int month = scanner.nextInt();
		
		switch (month){
			case 1:
				System.out.println("31일");
				break;
			case 2:
				System.out.println("28일");
				break;
			case 3:
				System.out.println("31일");
				break;
			case 4:
				System.out.println("30일");
				break;
			case 5:
				System.out.println("31일");
				break;
			case 6:
				System.out.println("31일");
				break;
			case 7:
				System.out.println("31일");
				break;
			case 8:
				System.out.println("31일");
				break;
			case 9:
				System.out.println("30일");
				break;
			case 10:
				System.out.println("31일");
				break;
			case 11:
				System.out.println("30일");
				break;
			case 12:
				System.out.println("31일");
				break;
		}
		
	}

}
