package sodam;

import java.util.Scanner;

public class sodamService {

	public void disp() {
		
		
		Scanner input = new Scanner(System.in);
	int num = 0, savenum=0, newnum=0 ;
	String id= null, pw= null, saveid= null, savepw = null ;
	
	while(true) {
	System.out.println("1. 로그인하기");
	System.out.println("2. 회원가입하기");
	System.out.println("3. 아이디 / 비밀번호 찾기");
	System.out.println("4. 초기 메뉴로 돌아가기");
	System.out.print(">>>>> ");
	num = input.nextInt();
	
	switch(num) {
	case 1:
		System.out.print("\n"+"ID : ");
		id = input.next();
		System.out.print("PW : ");
		pw = input.next();
		if(id.equals(saveid)) {
			if (pw.equals(savepw)) {
				System.out.println("\n"+"로그인 성공하였습니다."+"\n"); break;
			}else {
				System.out.println("\n"+"비밀번호가 일치하지 않습니다."+"\n"); break;
			}
			
		}else {
			System.out.println("\n"+"존재하지 않는 ID입니다."+"\n"); break;
		}
	case 2:
		System.out.print("\n"+"신규 ID : ");
		saveid = input.next();
		System.out.print("신규 PW : ");
		savepw = input.next();
		System.out.print("핸드폰번호 뒷자리 : ");
		savenum = input.nextInt();
		System.out.println("\n"+"회원가입 완료되었습니다."+"\n"); break;
	case 3:
		System.out.println("\n"+"핸드폰번호 뒷자리를 입력해주세요.");
		System.out.print(">>>> ");
		newnum = input.nextInt();
		
		if(newnum==savenum) {
			System.out.println("\n"+"저장된 ID와 PW입니다.");
			System.out.println("ID : "+saveid);
			System.out.println("PW : "+savepw+"\n"); break;
		}else {
			System.out.println("\n"+"정보가 일치하지 않습니다."+"\n"); 
		} break;
		
	case 4: return;
		
		
		
	}	
	}}
}



