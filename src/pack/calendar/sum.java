package pack.calendar;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("합을 구할 x 와 y를 입력하세요");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("x + y의 합 =  " + (x + y));
	}

}
