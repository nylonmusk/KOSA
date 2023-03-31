package kr.or.kosa.machine;
import java.util.Scanner;
import kr.or.kosa.machine.*;




public class MainMenu {
	static int mainMenu; //메뉴 선택 
	static int num; //수량
	static int sum;
	private String mainMenuname;  
	int total;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void MainMenu(){ //무조건 메인메뉴 선택해야함
		
	
		
		System.out.println("엽기메뉴를 선택해주세요");
		System.out.print("1.엽기떡볶이 2.엽기오뎅  3.반반 : "  );
		
		mainMenu = Integer.parseInt(sc.nextLine()); // 메뉴 받아오기
		int cnt=0;
		int topping =0;
		
		menu:while(true) 
		{
			switch(mainMenu)
			{
			case 1: //엽떡 선택
				this.mainMenuname = "YeopgiDduck";
				System.out.println("엽떡 선택하셨습니다.");
				System.out.println("수량을 선택하세요");
				cnt = Integer.parseInt(sc.nextLine());
				this.num = cnt;
				total = num*14000;
				break menu;
			case 2: //엽떡 선택
				this.mainMenuname = "YeopgiEomuk";
				System.out.println("엽오 선택하셨습니다.");
				System.out.println("수량 선택하세요");
				cnt = Integer.parseInt(sc.nextLine());
				this.num = cnt;
				total = num*14000;
				Topping t = new Topping();
				break menu;
			case 3: //엽떡 선택
				this.mainMenuname = "YeopgiHalf";
				System.out.println("반반 선택하셨습니다.");
				System.out.println("수량을 선택하세요");
				cnt = Integer.parseInt(sc.nextLine());
				this.num =cnt;
				total = num*14000;
				break menu;
			default:
				System.out.println("입력값이 잘못되었습니다.다시 선택해주세요");
				
			}
		}
		Sauce s = new Sauce();
		s.Sauce();
		
		System.out.print("추가 토핑을 하시겠습니까 Y/N?");

		String select = sc.nextLine();
		
		if(select.equals("Y")) {
				System.out.println("1.치즈 2.계란 3.소시지 (옵션 한개만 선택)..");
				topping=Integer.parseInt(sc.nextLine());
				Topping t = new Topping(topping);
				total+=t.addpay;
		}
		else {
			Topping t = new Topping();
			total+=t.addpay;
		}
		
		
		CookDish cd0 = new CookDish("조리준비");
		cd0.printCookDish();
		Payment p = new Payment();
		p.doPayMent(total);	//toping과 sauce를 선택하고 나온 금액 전달
		
		//조리시작
		
		
	}
}
