import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		
		//반복문 (while , do ~ while)
		int i = 10;
		while(i >= 10) { //true
			//반드시
			//증가감을 통해서 true ,false 판단
			//--i;  증가감의 위치도 고민하자 ....
			System.out.println(i);
			--i;
		}
		
		//while 1~100까지의 합
		int sum=0;
		int j = 1;
		while( j <= 100) { //for(int j = 1 ; j <= 100 ; j++
			//j++;
			sum+=j;
			j++;
		}
		System.out.println("sum :" + sum);

		
		//while(true){ } 메뉴만들어서 ...
		
		//while 문으로 구구단을 작성
		//for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
		//	for(int j = 1 ; j <= 9 ; j++) {
		
		
		//아래 코드의 문제점을 찿아 보세요
		int k = 2;
		int p = 1;
		while(k <= 9) {
			p = 1; //1로 정의
			while(p <= 9) {
				System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
				p++; //마지막 10
			}
			System.out.println();
			k++;
		}
		System.out.printf("k:%d , p:%d \n",k,p);
	
	
		int k2 = 2;
		//int p2 = 1;  local 
		while(k2 <= 9) {
			int p2 = 1; // block
			while(p2 <= 9) {
				System.out.printf("[%d]*[%d]=[%d]\t",k2,p2,k2*p2);
				p2++; //마지막 10
			}
			System.out.println();
			k2++;
		}
		//System.out.printf("k:%d , p:%d \n",k2,p2);
	
		// for(;;) { if(조건) break;}
		//while(true) { if(조건) break; }
		//do ~ while : 일단 한번은 강제적으로 수행 ... 그리고 조건을 보고 판단한다
		//do { 실행블럭 } while(조건판단)
		/*
		 메뉴구성
		 점심 메뉴를 선택하세요
		 1. 짜장
		 2. 짬뽕
		 3번 입력값 하면 잘못된 입력입니다 ....
		 다시 메뉴를 보여주기  
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		int inputData=0;
		do {
			System.out.println("숫자 입력해 (0~9):");
			inputData = Integer.parseInt(sc.nextLine());
		} while(inputData >= 10); //while 조건 true 계속해서 do문을 실행 
		                          //while 조건 false do 실행하지 않아요
		System.out.println("당신이 입력한 숫자는 : " + inputData);
	}

}
