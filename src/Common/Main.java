package Common;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1] ");
			System.out.println("[2] ");
			System.out.println("[3] ");
			System.out.println("[4] ");
			System.out.println("[5] ");
			System.out.println("[6] 프로그램 종료");
			System.out.print(">>>");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 	// 허은미

				break;
			case 2: 	// 방준혁

				break;
			case 3: 	// 박소담

				break;
			case 4: 	// 김영주

				break;
			case 5: 	// 니호영

				break;
			case 6:
				System.out.println("프로그램 종료");
				return;
			default: // 다른 값 입력
				System.err.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}