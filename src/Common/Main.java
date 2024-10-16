package Common;

import Commnunity.*;
import Naho.Na;
import bang.Servise;

import java.util.InputMismatchException;
import java.util.Scanner;
import login_h.Service01;
import sodam.sodamService;

public class Main {
	public static void main(String[] args) {
		CommunityServise com = new CommunityServise();
		Na na = new Na();
		Scanner sc = new Scanner(System.in);
		Service01 h = new Service01();
		Servise t = new Servise();
		sodamService s = new sodamService();

		while (true) {
			int menu = 0;
			System.out.println("[1] 로그인");
			System.out.println("[2] 계산기");
			System.out.println("[3] 로그인, 회원가입, 계정찾기");
			System.out.println("[4] 게시글 작성 및 삭제");
			System.out.println("[5] 미니 게임");
			System.out.println("[6] 프로그램 종료");
			System.out.print(">>>");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력!!!");
				sc = new Scanner(System.in);
			} finally {
				switch (menu) {
				case 1: // 하은미
					h.dip();
					break;
				case 2: // 방준혁
					t.display();
					break;
				case 3: // 박소담
					s.disp();
					break;
				case 4: // 김영주
					com.display();
					break;
				case 5: // 나호영
					System.out.println("=====================================");
					na.display();
					System.out.println("=====================================");
					break;
				case 6:
					System.out.println("프로그램 종료");
					return;
				default: // 다른 값 입력
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}
	}
}