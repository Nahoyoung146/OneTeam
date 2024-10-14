package Naho;

public class UserService {
	private UserDTO dto;
	public UserService() {
		dto = new UserDTO("플레이어1");
	}

	public void atk(UserDTO user1, UserDTO user2) {
		System.out.println(user1.getName() + "이 공격을 합니다.");
		user2.setHealth(user2.getHealth() - user1.getAtk());
		System.out.println("적 체력 : " + user2.getHealth());
	}
}