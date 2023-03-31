public class Ex09_Statement {
	public static void main(String[] args) {
		
		/*
		 제어문
		 조건문 : if(3가지) ,  switch(조건) { case 값 ..break} 
		 반복문 : for(반복횟수가 명확){} , while(진위){} , do{} ~ while() 
		 분기문 : break(블럭탈출) , continue(아래 구문 skip)
		 */
		int count = 0;
		if(count < 1) System.out.println("true"); //단일 if {}생략 가능
		
		if(count < 1) {
			System.out.println("{ true }");
		}
		
		char data='A';
		switch(data) {
			case 'A' : System.out.println("문자 비교 같아요");
			     break;
			case 'B' : System.out.println("....");
			     break;
			default  : System.out.println("나머지 처리");     
		}
		
		//for문
		//1~100까지 합
		int sum=0;
		for(int i = 1 ; i <= 100 ; i++) {
			//System.out.println(i);
			//sum = sum + i;
			sum+=i;
		}
		System.out.printf("1~100까지 누적 합 : %d \n",sum); //5050
		
		// 1~5까지의 합
		// for문과 while 쓰지 말고 
		sum = 5 * (1 + 5)/2; //안할려고 for문 학습
		System.out.println("sum : " + sum);
		
		//1 ~ 10까지의 홀수 합
		//단 for문 사용
		//단 for문에 if문을 쓰지 마세요
		// for(초기값 ; 조건식 ; 증가감) 
		// 1, 3, 5, 7, 9
		int sum2 = 0;
		for(int i = 1 ; i <= 10 ; i+=2) { //i=i+2
			sum2+=i;
		}
		System.out.println("sum2 : " + sum2);
	
		//for문에서 if문 사용해서 1~1000까지 짝수의 합을 구하세요
		int sum3 = 0;
		for(int i= 1 ; i <= 1000 ; i++) {
			//sum3+=i;
			//어느 시점 (짝수 정의)
			// % 2 == 0
			if(i % 2 ==0) {
				sum3+=i; //2 4 6 ...
			}
		}
		System.out.println("sum3 : " + sum3);
		
		//초급자 구구단 못하면 ...ㅠㅠ
		//중첩 for문
		//행과 열
		for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println(); //엔터
		}
		
		//for문 + 분기문 (continue , break)
		//초급자 Today Point(continue(아래 구문 skip) , break (for , while 블럭 탈출)
		
		for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
			for(int j = 1 ; j <= 9 ; j++) {
				if( i == j) {
					break; //for 블럭 탈출
				}
				System.out.printf("%s","*");
			}
			System.out.println(); //엔터
		}
		
		for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
			for(int j = 1 ; j <= 9 ; j++) {
				if( i == j) {
					continue; //continue 아래 구문 skip >> System.out.printf("%s","*");
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println(); //엔터
		}
		
		
		for(int i = 2 ; i <= 9 ; i++) {   //블럭변수 i scope
			for(int j = 1 ; j < i ; j++) {  //배열에서 정렬알고리즘 bubble ...
				System.out.printf("%s","*");
			}
			System.out.println(); //엔터
		}
		
		//100부터 0까지의 출력 (시작값 100)
		for(int i = 100 ; i >= 0 ;  i--) {
			System.out.println(i);
		}
		
		//초급자가 아닌분들
		//피보나치 수열 (제어)
		int a = 0 , b = 1, c =  0;
		for(int i =0 ; i < 10 ; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("[%d]*[%d]=[%d]\t",a,b,c);
			System.out.println("  " + c);
		}
	}

}



