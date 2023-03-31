import java.util.Scanner;

public class Ex11_Statement_Quiz {

	public static void main(String[] args) {
		//메뉴를 보여주고 사용자에 선택 ....
		//원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여 주세요
		
		//1.예금
		//2.출금
		//3.잔고
		//4.종료
		
		
		//잔액 변수를 생성 (balance)
		//예금 처리  + 누적
		//출금 처리  - 누적
		//잔고      balance  출력
		//종료      프로그램 끝 (함수의 종료  , 프로그램의 강제 종료)
		
		boolean auto = true;
		int balance = 0; //잔액
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("***************************");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("***************************");
			
			System.out.println("선택하세요");
			
			int input = Integer.parseInt(sc.nextLine());
			
			//판단
			switch(input) {
				case 1 : System.out.println("예금처리..");
				           balance += Integer.parseInt(sc.nextLine());
				         break;
				case 2 : System.out.println("출금처리..");
		         		   balance -= Integer.parseInt(sc.nextLine());
		         		 break;
				case 3 : System.out.println("잔고..");
		                 break;
				case 4 : System.out.println("종료합니다");
						 auto =false;
		                 break;
		        default : System.out.println("올바른 메뉴를 선택하세요");         
			
			}
			
			if(auto == false) {
				break; //또는  
			}
	}

}

}
