package bang;

import java.util.Scanner;

public class Servise {
	Dto dto = new Dto();
	
	public void sum(int num1, int num2) {
		dto.setNum1(num1+num2);
	}
	public void sub(int num1, int num2) {
		dto.setNum1(num1-num2);
	}
	public void mul(int num1, int num2) {
		dto.setNum1(num1*num2);
	}
	public void div(int num1, int num2) {
		dto.setNum2((double)num1/(double)num2);
		dto.setNum1(num1%num2);
	}
	
	public void display(){
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		int num = 0, num1=0, num2=0;
		while (bool) {
			System.out.println("1.덧셈");
			System.out.println("2.뺄셈");
			System.out.println("3.곱셈");
			System.out.println("4.나눗셈");
			System.out.println("5.종료");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("두 수를 입력하시오");
				num1 = input.nextInt();
				num2 = input.nextInt();
				sum(num1, num2);
				System.out.println("두 수의 합은 " + dto.getNum1());
				break;
			case 2:
				System.out.println("두 수를 입력하시오");
				num1 = input.nextInt();
				num2 = input.nextInt();
				sub(num1,num2);
				System.out.println("두 수의 차는 " + dto.getNum1());
				break;
			case 3:
				System.out.println("두 수를 입력하시오");
				num1 = input.nextInt();
				num2 = input.nextInt();
				mul(num1,num2);
				System.out.println("두 수의 곱은 " + dto.getNum1());
				break;
			case 4:
				System.out.println("두 수를 입력하시오");
				try {
					num1 = input.nextInt();
					num2 = input.nextInt();
					if(num1*num2<=0) {
						throw new Exception("0보다 낮은 수는 쓰지마세요");
					}
					div(num1,num2);
					System.out.println("두 수를 나누면 " + dto.getNum2() + " 나머지는 " + dto.getNum1());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				bool=false;
				System.out.println("계산기 종료");
				break;

			}
		}
	}
}
