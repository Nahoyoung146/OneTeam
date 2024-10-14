package Naho;

public class Player1Service extends UserService {
	private Player1DTO dto1;

	public Player1Service() {
		dto1 = new Player1DTO("플레이어1");
	}

	public void Firepunch(Player2DTO dto2) {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(dto1.getName() + "이 불꽃펀치를 사용하였습니다.");
		dto2.setHealth(dto2.getHealth() - 100 * a);
		System.out.println("상대방 체력 : " + dto2.getHealth());
	}
}