
public class Ex05_Operation {

	public static void main(String[] args) {
		//연산자 (산술 , 논리 , 관계)
		int result = 100 / 100;
		System.out.println("result : " + result);

		result = 13/2; //몫
		System.out.println("result : " + result);
		
		//나머지를 구하는 연산자 (%)
		result = 13 % 2;
		System.out.println("result : " + result);
		
		//증가 , 감소 (증가감 연산자 : ++ 1씩증가 , -- 1씩감소)
		int i = 10;
		++i; //전치증가
		System.out.println("i :" + i);
		i++; //후치증가
		System.out.println("i :" + i);
		//다른 결합되지 않고 혼자서 있으면 전치 와  후치는 의미가 없다
		
		//Today point (증가감 연산자와 다른 연산이 결합되면)
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2; //전치가 먼저 동작
		System.out.println("result2 :" + result2 + " j2 : " + j2);
		//result2 :10   j2 : 5
		result2 = i2 + j2++;
		System.out.println("result2 :" + result2 + " j2 : " + j2);
		//result2 :10   j2 : 6
		
		byte b = 100;
		byte b2 = 1;
		
		//byte b3 = b + b2; //Type mismatch: cannot convert from int to byte
		//연산시 자바는 기본적으로 4byte 공간을 만들고 공간에 값을 넣고 연산 (int + int)
		
		//byte b3 = (byte)(b + b2); //손실이 발생할 수 있다
		//System.out.println("b3 : " + b3);
		
		int b3 = b + b2; //손실은 발생하지 않는다
		System.out.println("b3 : " + b3);
		
		/*
		 Today point
		 1. 정수의 연산은 [int] 타입으로 변환 후 처리된다 
		 ex) byte + short >> 컴파일러가 내부적으로 값들을 int 방에 넣고 처리 >> int + int 처리
		 ex) char + char  >> 컴파일러가 내부적으로 int + int 처리
		 정수의 연산에  int 보다 작은 타입들은 내부적으로 모두 int 바꾸어 연산 처리 된다
		 정수에서 long 예외 .... 나머지는 byte , char , short >> int  전환 후 처리 
		 ex) char + int >> int ,  
		     int + int  >> int , 
		     int + long >> long (예외)
		  
		 2. 정수 + 실수 >> 타입의 크기와 상관없이 >> 실수가 승자 
		 */
		
		long lo = 10000000000L;
		float fo = 1.2f;
		//long result3 = (long) (lo + fo);  1번 가능
		
		float result3 =lo + fo;  //2번 가능
		//실수가 큰 타입
		
	    char c2 = '!'; //33
	    char c3 = '!'; //33
	    int result4 = c2 + c3;
	    System.out.println("reslut4 : " + result4);
	    
	    //변수 >> 타입(자료형) >> 연산(산술, 논리 ,관계) >> 제어문(if , for, while ...)
	    //제어문
	    int sum=0; //local variable (사용전 반드시 초기화)
	    for(int j =0 ; j <= 100 ; j++) {  // for(int j =0 j라는 변수는 Scope
	    	//sum = sum + j;
	    	//System.out.println("sum : " + sum); //5050
	    	if(j % 2 == 0) { //짝수라면  //2의 배수라면
	    		sum+=j; // sum = sum + j
	    	}
	    }
	    
	    System.out.println(sum);
	    
	    // == 연산자 (값을 비교하는 연산자)
	    if(10 == 10.0f) {  //타입을 비교하는 것이 아니고 가지고 [값을 비교]
	    	 System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	    
	    // != 부정 연산자
	    if('A' != 65) {
	    	//같지 않다면
	    	System.out.println("어 같지 않아 : true");
	    }else {
	    	//같다면
	    	System.out.println("어 같은 값이야 : false");
	    }
	    
	    
	    //Today Point
	    //연산자 중에서 제어문 역할  (조건, 반복) 
	    //삼항연산자
	    int p = 10;
	    int k = -10;
	    int result5 = (p == k) ?  p : k;
	    System.out.println("result5 : " + result5);
	    
	    // === javascript 타입도 같고 값도 같은 것을 
	    
	    //if 문
	    int result6 = 0;
	    if(p == k) {
	    	result6 = p;
	    }else {
	    	result6 = k;
	    }
	    System.out.println("result6 : " + result5);
	
	    /*
	     진리표 (논리연산)
	     0 : 거짓 (false)
	     1 : 참   (true)
	     
	     OR 연산 , AND 연산
	     
	     DB 쿼리 Oracle)
	     SQL 자연어 ....
	     select * from emp  where job='IT' and sal > 3000
	     select * from emp  where job='IT' or  sal > 3000 
	             AND   ,   OR
	     0   0    0        0
	     0   1    0        1
	     1   0    0        1
	     1   1    1        1
	    
	     연산자 비트 연산 ( | or연산 ......    &  and 연산)
	     || 논리연산 (OR) ,    && 논리연산 (AND)
	     
	     
	     */
	    int x = 3;
	    int y = 5;
	    
	    //비트 연산 (십진수 >> 이진수 바꾸어서 연산)
	    System.out.println("x | y : OR 연산" + (x | y));
	    /*
	     256  128  64  32  16  8  4  2  1
	                           0  0  1  1  >> 3
	                           0  1  0  1  >> 5
	                           0  1  1  1  >> | 비트 OR 연산
	                              4+2+1    >> 7
	     */
	
	    System.out.println("x & y : AND 연산" + (x & y));
	    /*
	     256  128  64  32  16  8  4  2  1
	                           0  0  1  1  >> 3
	                           0  1  0  1  >> 5
	                           0  0  0  1  >> & 비트 AND 연산
	                                1      >> 1
	    
	     비트 (영상 처리 , 판독)
	     
	     Today Point
	     (&& >> and 연산)
	     (|| >> or  연산)
	     if(10 > 0 &&  -1 > 1 && 100 > 2 && 1 > -1) { A } else { B } ... 거짓 조건이 나오는 순간 처리
	     if(10 > 0 ||  -1 > 1 || 100 > 2 || 1 > -1) { A } else { B } 
	     */
	    
	    int data = 90;
	    switch(data) {
	    	case 100 : System.out.println("100입니다");
	    	case 90  : System.out.println("90입니다");
	    	case 80  : System.out.println("80입니다");
	    	default  : System.out.println("일치하는 값이 없습니다");
	    	
	    	/*
	    	 90입니다
			 80입니다
			 일치하는 값이 없습니다 
	    	  
	    	 */
	    }
	    
	    data = 90;
	    switch(data) {
	    	case 100 : System.out.println("100입니다");
	    			   break;
	    	case 90  : System.out.println("90입니다");
	    			   break;
	    	case 80  : System.out.println("80입니다");
	    	           break;
	    	default  : System.out.println("일치하는 값이 없습니다");
	    	
	    	/*
	    	 90입니다
            */
	    }
	    
	    int month=3; //월을 데이터 제공
	    String res=""; //빈문자열로 초기화
	    switch(month) {
	    	case 1:
	    	case 3:
	    	case 5:
	    	case 7:
	    	case 8:
	    	case 10:
	    	case 12: res ="31일";
	    			 break;
	    	case 4:
	    	case 6:
	    	case 9:
	    	case 11: res ="30일";
	    			 break;
	    	case 2:  res = "29일";
	    			 break;
	    	default : res= "월 데이터가 아닙니다";	
	    }
	    
	    System.out.println(month + " 월 은 " + res + " 까지 입니다");
	    
	    //난수 (랜덤값 , 임의의 추출값) 을 얻기를 원해요
	    //쉬운방법 : 구글 검색 (친절하게)
	    //자바를 만들이는 자습서 (API 문서) 자원에 설명과 사용방법 (영어)
	    //https://docs.oracle.com/javase/8/docs/api/index.html   검색
	    //패키지 기준 (폴더별로 자원을 모아 모아 ...)
	    //java.lang.Math  클래스 활용하면 여러가지 수학적인 기능 사용 ...
	    //import java.lang.*; 생략 .. default open ...
	    
	    //public static double random();
	    //double greater than or equal to 0.0 and less than 1.0
	    //결과 : 0.0 <= random < 1.0
	    
	   System.out.println("Math.random() : " + Math.random()); 
	   
	   System.out.println("Math.random() * 10: " + (Math.random()) * 10);  //0~9
	   
	   //(int)(Math.random() * 10) + 1
	   System.out.println((int)(Math.random() * 10) + 1); //1 ~ 10 까지 난수 (중복값 나와요)
	   
	   
   
	   
	
	   /*
	   int jumsu = ((int)(Math.random()* 10) + 1)*100;
	   금요일 쿼즈	  
	   우리는 백화점 경품 시스템을 만들려고 한다
 	   경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
       경품 추첨시 1000 점수가 나오면
       경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
       경품 추첨시 900 점수가 나오면
       경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
       경품 추첨시 800 점수가 나오면
       경품으로  냉장고 , 한우세트 , 휴지
       경품 추첨시 700 점수가 나오면
       경품으로  한우세트 , 휴지
       경품 추첨시 600 점수가 나오면
       경품으로  휴지
       그외 점수는 100 ~ 500 까지는 칫솔 
       경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
       사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
       
       프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
	   */
	      int jumsu = ((int)(Math.random()* 10) + 1)*100;
		  String msg="";//초기화
		  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
		  switch(jumsu) {
		  	case 1000:msg+="Tv"; //연산자 학습
		  	case 900:msg+="NoteBook ";
		  	case 800:msg+="냉장고 ";
		  	case 700:msg+="한우 ";
		  	case 600:msg+="휴지 ";
		  	         break;
		  	default:msg+="칫솔";     
		  }
		  System.out.println(msg);
		  
		  
		  //switch(조건) 정수만 .. 아니죠
		  //조건식은 "문자열"도 가능 , "문자" 가능
		  
		  String m = "F";
		  String f="";
		  switch(m) {
		  	case "A":
		  	case "B":
		  	case "C":
		  	case "D":
		  	case "E":
		  	case "F":
		  	case "G": f="ok";
		  	   break;
		  	case "H":
		  	case "k": f= "no";
		  	   break;
		  	default : f ="no data";
		  }
	      System.out.println("결과 : " + f);
	}

}
