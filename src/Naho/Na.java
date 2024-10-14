package Naho;

import java.util.Scanner;

public class Na {
	private Player1DTO dto1;
	private Player2DTO dto2;
	private Player1Service service1;
	private Player2Service service2;

	public Na() {
		dto1 = new Player1DTO("영희");
		dto2 = new Player2DTO("철수");
		service1 = new Player1Service();
		service2 = new Player2Service();
	}

	public void display() {
		boolean player1 = false, player2 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				dto1.getName() + "과(와) " + dto2.getName() + "이 전투를 합니다.\n각자 고유스킬이 있고 전투 중에 한번만 사용가능하며 적을 죽이면 이깁니다.");
		while (true) {
			if (!player1) {
				System.out.print(dto1.getName() + "의 공격 선택/1. 일반 공격 2. 스킬 사용 : ");
				int num1 = sc.nextInt();
				if (num1 == 1)
					service1.atk(dto1, dto2);

				else {
					service1.Firepunch(dto2);
					player1 = true;
				}
			}

			else
				service1.atk(dto1, dto2);

			if (dto2.getHealth() <= 0) {
				System.out.println(dto2.getName() + "다운!!!!\n" + dto1.getName() + "이(가) 이겼습니다.");
				dto2.setHealth(1000);
				break;
			}

			if (!player2) {
				System.out.print(dto2.getName() + "의 공격 선택/1. 일반 공격 2. 스킬 사용 : ");
				int num2 = sc.nextInt();
				if (num2 == 1)
					service2.atk(dto2, dto1);

				else {
					service2.Iceshield();
					player2 = true;
				}
			}

			else
				service2.atk(dto2, dto1);

			if (dto1.getHealth() <= 0) {
				System.out.println(dto1.getName() + "다운!!!!\n" + dto2.getName() + "이(가) 이겼습니다.");
				dto1.setHealth(1000);
				break;
			}

		}
	}
}