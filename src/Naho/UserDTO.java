package Naho;

public class UserDTO {
	private int health, atk;
	private String name;

	public UserDTO(String name) {
		this.health = 1000;
		this.atk = 50;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAtk() {
		return atk;
	}

	public String getName() {
		return name;
	}
}