package login_h;

import java.util.Scanner;

public class Service01 {
	private DTO01 dto;
	public Service01() {
		dto=new DTO01();
	}
	public int loginCheck(String newID, String newPWD) {
		if(newID.equals(dto.getSaveID())) {
			if(newPWD.equals(dto.getSavePWD())) {
				
				return 0;
			}else {
				
				return 1;
			}
		}else {
		
			return -1;
		}
	}
	public int register(String saveID, String savePWD) {
		if(dto.getSaveID()==null) {
			dto.setSaveID(saveID);
			dto.setSavePWD(savePWD);

			return 0;
		}else{
			return 1;
		}
	}
	public int memberOut() {
		if(dto.getSaveID()==null) {
			return 1;
		}else {
			dto.setSaveID(null);
			dto.setSavePWD(null);
			return 0;
		}
	}
public void dip() {
	Scanner input=new Scanner(System.in);
	int num,result;
	String newID=null, newPWD=null, saveID=null, savePWD=null;
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.탈퇴");
		System.out.println("4.종료");
		num=input.nextInt();
		switch(num) {
		case 1: 
			System.out.println("ID 입력");
			newID=input.next();
			System.out.println("비밀번호 입력");
			newPWD=input.next();
			result=loginCheck(newID,newPWD);
			if(result==0) {
				System.out.println("인증 통과");
			}else if(result==1) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				System.out.println("존재하지 않는 ID입니다.");
			}break;
		case 2:
			System.out.println("아이디 등록");
			saveID=input.next();
			System.out.println("비밀번호 등록");
			savePWD=input.next();
			
			result=register(saveID, savePWD);
			if(result==0) {
				System.out.println("가입 축하");
			}else {
				System.out.println("가입 실패");
			}break;
		case 3:
			result=memberOut();
			if(result==0) {
				System.out.println("탈퇴 성공!!");
			}else {
				System.out.println("가입되어있음");
			}break;
		case 4:
			System.out.println("종료");
			return;
		}
	}
}
}
