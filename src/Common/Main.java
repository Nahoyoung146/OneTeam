package Common;

import java.util.Scanner;

import bang.Servise;
import login_h.Service01;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service01 h= new Service01();
		Servise t = new Servise();
		while (true) {
			System.out.println("[1]로그인");
			System.out.println("[2]계산기");
			System.out.println("[3] ");
			System.out.println("[4] ");
			System.out.println("[5] ");
			System.out.println("[6] 프로그램 종료");
			System.out.print(">>>");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 
				h.dip();	// 허은미
				break;
			case 2: 	// 방준혁
				t.display();
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