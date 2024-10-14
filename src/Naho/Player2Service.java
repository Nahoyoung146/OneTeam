package Naho;

public class Player2Service extends UserService {
	private Player2DTO dto2;

	public Player2Service() {
		dto2 = new Player2DTO("플레이어2");
	}

	public void Iceshield() {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(dto2.getName() + "이 얼음방패를 사용하였습니다.");
		dto2.setHealth(dto2.getHealth() + 100 * a);
		System.out.println("상대방 체력 : " + dto2.getHealth());
	}
}