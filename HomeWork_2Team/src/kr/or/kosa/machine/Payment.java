package kr.or.kosa.machine;
import java.util.Scanner;

public class Payment {
	public int num;
	private int inputMoney;		//고객이 투입할 금액
	private int tempMoney; //떡볶이의 가격을 받아올 변수
	private int cost;
	String pp;
	boolean run = true;
	boolean run2 = true;
	
	//토핑과 소스를 선택한 뒤 결정된 금액 호출
	//돈 투입
	//거스름돈 반환
	public void doPayMent(int tempMoney) {
		this.tempMoney = tempMoney;
		//System.out.println(tempMoney);
		pay:while(true) {
			Scanner sc = new Scanner(System.in);
			while(run) {
				System.out.print("결제를 진행하시겠습니까?(Y, N): ");
				pp = sc.nextLine();
				if(pp.equals("Y")) {
					System.out.println("결제를 진행합니다.");
					run = false;
					break;
				} else if(pp.equals("N")) {
					System.out.println("결제를 취소하셨습니다.");
					System.out.println("주문이 취소되었습니다.");
					break pay;
				} else {
					System.out.println("잘못된 값을 입력하셨습니다.");
				}
			}
			
			System.out.printf("금액을 투입하여 주십시오(%d) : ", tempMoney);
			inputMoney = Integer.parseInt(sc.nextLine()); //고객이 입력한 금액
			cost = inputMoney-tempMoney;
			if (inputMoney <= 0) {
				ErrorMessage em = new ErrorMessage("잘못된 금액을 입력하셨습니다.");
				em.printErrorMessage();
				//Exception e = new Exception();
				//throw e;
			} else if((inputMoney-tempMoney)<0) {
				ErrorMessage em = new ErrorMessage("금액이 부족합니다.");
				em.printErrorMessage();
			} else {
				//거스름돈 제공.
				System.out.println("====================");
				System.out.println("     [ 거스름돈 ]");
				System.out.println("====================");
				int unit = 10000; //화폐단위
				int num = 0;	//화폐매수
				int sw = 0;	//스위칭

				while(run2) {
					num = cost/unit;
					System.out.printf("    %d원  %d개\n", unit, num);
						
					if (unit > 1) {
						cost -= unit * num;
							
						if (sw==0) {
							unit /= 2;
							sw = 1;
						} else {
							unit /= 5;
							sw = 0;
						}
					} else {
						CookDish cd1 = new CookDish("조리중");
						cd1.printCookDish();
						CookDish cd2 = new CookDish("조리완료");
						cd2.printCookDish();
						run2 = false;
						break pay;
					}
				}
			}
			
			
		}
	}
	
}