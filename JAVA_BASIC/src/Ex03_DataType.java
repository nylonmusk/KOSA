/*
1. 자바가 제공하는 기본 타입(원시타입) >> 8가지
2. 8가지 타입은 값을 저장 하는 타입
숫자    정수(음의정수 0 양의정수)   byte(8bit) -128 ~ 127
                             char(2byte) 한문자 (내부적으로는 정수값) 
                             영문자,특수문자,공백 (1byte) , 한글 1자(2byte)
                             협의 (국제) >> 모든 문자는 2byte >> 표준화 >> unicode >> 아스키 코드표
      						 ex) char c = 'A' , char ch = '가'
      						 short 호환성 
      						 int (4byte -21 ~ 21) **~~ ** 정수 리터럴의 기본 타입 int 
      						 long (8byte)
       실수(부동소수점)          float (4byte) 7자리 정도의 소수 표현 가능
                             double(8byte) 15자리 정도의 소수 표현 가능
                             (boolean) 정밀도가 높다(표현 범위가 크다) **~~** 실수 리터럴의 기본 타입 double  
논리                          참 거짓을 표현하는 타입 (true, false) 판단 

현재는 대충 ....
정수는 int , 실수는 double 타입을 사용하면 별 문제 없다

가장 많이 사용되는 타입 (String)
String str="홍길동";
우리가 가장 많이 사는 String 은 클래스 입니다 
String 타입은 문자열을 담을 수 있습니다
ex) String str = new String("홍길동");
약속) 별도의 이야기 ..... 8가지 기본 타입 + 1(String) >> String 은 int , long 처럼 쓰세요

자바 타입은
1. 값타입 : 8 + 1 (값을 저장)
2. 참조타입 (주소값을 저장) : 클래스 , 인터페이스 , 배열 등등 .....

[정수값을 표기하는 방법]
100      십진수
0x2a     16진수 
0123     8진수 
0b11010  2진수
123L or 123l    리터럴 long 타입 십진수 **
Ox2aL           리터럴 long 타입 16진수

[실수값을 표기하는 방법]
3.14
123.4
123.4F , 123.4f
1.234e2승 >> 123.4 값을 지수표기법
1.234e2승f

문자값을 표기하는 방법
'A' or  '가'
'\u0065'

진리값을 표기하는 방법
true
false

문자열을 표기하는 방법
"홍길동"
"ABCD"




*/
public class Ex03_DataType {
	public static void main(String[] args) {
		//int (-21 ~ 21)
		int num = 100000000;
		System.out.println("num : " + num);
		//int num2 = 100000000000; //The literal 100000000000 of type int is out of range 
		// literal 개발자 직접 입력한 값 (있는 그대로의 값)
		// 컴파일 오류 
		// 나는 4byte 크기의 방인데 .... 더 큰값은 담을 수 없어
		
		//1. 해결방법
		//int num2 = 100000000000;
		long num2 = 100000000000L; //The literal 100000000000 of type int is out of range 
		//개발자 입력하는 정수 범위는 int 벗어나면 안되요
		System.out.println("num2 : " + num2);
		
		long num3 = 100; //속지 않을 려면 값을 보지 말고 타입을 보세요 (리터럴값도)
		                 //long num3 = (long)100
		                 //암시적 형변환 (자동으로 컴파일러가 ... 큰타입에 작은 타입을 넣는 것은)
						 //작은 타입에 있는 값을 큰 타입에 넣는 것은 당근이지
		
		//해결하세요
		//손실이 발생하더라 담아 보겠다 
		//int num4 = 10000000000;   //The literal 10000000000 of type int is out of range
		//int num4 = 10000000000L;  //Type mismatch: cannot convert from long to int
		//담아 담아 (손실 ....) 명시적 형변환 , (타입 변환) ,  캐스팅
		int num4 = (int)10000000000L;
		System.out.println("타입 변환 : " + num4); //타입 변환 : 1410065408 쓰레기값 
		//정상적인 해결 방법이 아니다 (버려지는 값)
		
		//데이터 손실이 없어요 다행이도 ... 있을 수 도 있어 
		//1. 강제 형변환
		//int num5 = (int) 1000L; //Type mismatch: cannot convert from long to int
		
		//2. 담을 그릇을 크게 
		//long num5 = 1000L;
		
		//char 2byte  >> 16bit >>  0 ~ (216-1) >> 0 ~ 65535 (유니코드)
		/*
		유니코드(영어: Unicode)는 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 산업 표준이다  
		유니코드(Unicode)는 전 세계의 모든 문자를 다루도록 설계된 표준 문자 전산 처리 방식이다.  
		> 컴퓨터는 이진수만 안다.
        > 컴퓨터와 내가 문자를 입력하고 출력할 수 있도록 해주는게 바로 문자 코드다.
        > 그리고 문자코드와 숫자를 매칭시킨 표를 문자표라고 한다.
        > 대표적으로 아스키 코드표가 있다
		아스키 코드표 (ASCII Codes)
        = American Standard Code for Information Interchange
		*/
		
		//char 2byte : 한 문자를 표현하기 위해서 만든 타입
		// 영문자 , 특수문자 , 공백 , 한글  >>>> 한문자로 표현하는 표준화
		// 한문자 >> 'A' , '가' , ' '
		// 문자열 >> "abcd" >> String str="abcd";
		
		char ch = '가';
		System.out.println("한문자 : " + ch);
		//char ch2='가나';  예외 발생 (컴파일도 안되요) ...한문자만 가능
		
		ch = 'a';
		ch = 'A';
		
		// char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다)
		// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요
		int chint = ch;
		System.out.println("ch 문자를 십진수 보면 : " + chint); // 65
		
		//int chint = ch;
		//내부적으로 암묵적으로 자동 형변환이 발생 했어요(자동으로)
		//int chint = (int)ch;
		
		char chint2 = 'a';
		System.out.println(chint2);
		int intch2 = (int)chint2; //개발자가 직접 형변환 문제 없다
		
		
		int intch3 = 65;
		//char chint3 = intch3; //Type mismatch: cannot convert from int to char
		
		//1 해결 (명시적 형변환) >> 데이터 손실 발생
		//char chint3 = (char) intch3;
		
		//2 해결 받는 그릇을 크게 ... (개발자의 의도 문자를 보고 싶어요)
		//int chint3 = intch3;
		
		//char chint3 = intch3; >> 위로 올라가서 char intch3 = 65;
		
		char chint3 = (char) intch3;
		System.out.println("chint3 가지는 문자값 : " + chint3);
		
		/*
		 1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
		 1.1 리터럴 값에 대해서
		 1.1.1 정수 리터럴의 기본 타입은 int
		 1.1.2 실수 리터럴의 기본 타입은 double
		 
		 2. 암시적 형변환 , 명시적 형변환
		 2.1 큰타입에 작은 타입의 값을 넣는 것은 암시적 형변환를 하기에 개발자 ...그냥 ...사용
		 2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문제 강제적(명시적) 형변환
		 2.2.1  접미사 L , l ,   (int)정수 , (long)정수
		 KEY POINT 강제적 형변환  데이터 손실을 감수 .....  책임은 개발자가 져야 한다 .....
		 ex) char c = (char) int 범위값 .... 손실 발생... 
		 */
		
		//String 타입  (8+1) 값타입 처럼 사용하자 >> 값타입 처럼 써도 문제 없게 만들었어요
		//문자열 >> 문자의 집합 >> 문자의 배열은 >> 문자열
		// int , long 동일하게 사용하세요
		String name = "홍길동";
		name = "홍길동 바보";
		
		String color = "red";
		color = color + " 방가방가"; // 오라클  + 산술만 해요 >> 결합 연산자 ||
		System.out.println(color);
		
		//TIP)
		//연산자는 언어마다 표현이 달라요
		//JAVA   >>  + 산술 하고 , 결합도 해요
		//Oracle >>  + 산술만 해요 , 결합연산자 ||   '안녕' || '방가방가' >> 
		
		
		//자바의 타입은 불합리하다 .....
		//처음 부터 타입을 정의하고 하는 것에 대한 불만
		
		
		//Tip
		/*
		  let i;  
		  i = 100; //값이 입력되면 그때 타입을 정의
		  const c;
		 */
		
		//java에서 특수 문자 처리하기
		//char sing =''; 한문자 공백 , 영문 , 한글 등
		//char sing ='''; //Invalid character constant
		//이스케이프 문자 : 특정 문자앞에 \ 다음 값은 데이터 인정
		char sing ='\'';		
		System.out.println(sing);
		
		//Quiz) 홍"길"동 이라는 문자열을 출력하고 싶어요
		String username = "홍\"길\"동";
		System.out.println(username); //홍"길"동
		
		String str1 = "1000";
		String str2 = "10";
		String result = str1 + str2; // + 결합 (문자열)  "100010"
		System.out.println("result : " + result);
		
		
		System.out.println("100"+100); //100100
		System.out.println(100+"100"); //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+(100+"100")); //100100100
		System.out.println(100+"100"+100); //100100100
		
		//Quiz 경로 "C:\Temp" 문자열을 String 변수에 담아서 출력해 보세요
		String path = "C:\\Temp"; //valid ones are  \b  \t  \n  \f  \r  \\
		System.out.println("path : " + path); //path : C:\Temp
		// \t (tab) , \n (new line)
		path = "C:\\T\te\tm\tp\nhello";
		System.out.println("path2 : " + path);
		
		
		//byte : 네트워크 데이터 교환 .. 파일처리 ... 이미지 read >> Array
		//long : 금융 화페 
		
		//실수형 (부동소수점)
		//float 4byte
		//double 8byte 
		//*** 실수 리터럴은 기본 타입 double ***
		
		//*실수는 그냥  double 타입 사용하는데 float 사용시는 명시적으로 접미사를 붙인다*
		
		//float f = 3.14; //Type mismatch: cannot convert from double to float
		float f = 3.14f;
		float f2 = (float)3.14; //이런 경우 데이터 손실 ...가져 올 수도 있다
		
		//현명한 개발자
		//처음부터 타입을 크게 잡아서 사용
		double d = 3.14;
		
		//1. int 4byte  , float 4byte 실수가 크다
		//2. float 과 double 중에서 정밀한 값의 표현  > double
		
		float data = 1.123456789f;
		System.out.println("float data : 1.123456789 : " + data); //8에서 반올림  7이 8로 변경
		//대략적으로 소수이하 7자리 (반올림)  1.1234568
		
		double data2 = 1.123456789123456789;
		System.out.println("double data : 1.123456789123456789 : " + data2);
		//대략적으로 소수이하 16자리 (반올림)  1.1234567891234568
		
		//추후에 .....
		//BigDecimal 사용법 정리 보면서  (https://jsonobject.tistory.com/466)
		//정밀한 수를 표현하고 ..... double의 문제점을 알아 보겠습니다
		
		//Quiz 1)
		double data3 = 100;
		//결과값은
		System.out.println("data3 :" +data3); //100.0
		
		//Quiz 2)
		double data4 = 100;
		int number = 100;
		
		//int result2 = data4 + number; // double + int >> double
		//해결방법은
		// int result2 = (int) (data4 + number);  1번  (큰것을 작은것 강제적으로 손실)
		// double result2 = data4 + number;       2번  (0)
		
		//Quiz 3)
		 int number2 = 100;
		// byte b2 = number2; //Type mismatch: cannot convert from int to byte
		//결과는 (강제로 캐스팅(형변환) or 받는쪽 크기 확장)
		// byte b2 = (byte)number2;
		// int b2 = number2;
		
			
		//Today Point
		//1. 큰타입 + 작은 타입 이 연산 결과는 큰타입
		//2. 타입간 변환 >> 변수가 가는 값을 보지 말고 변수의 타입으로 판단하자
		//3. 명시적(강제적) 형변환 데이터 손실을 고민하자
		 
		 int data5 = 100;
		 byte b3 = (byte)data5; //명시적 강제적 형변환
		 
		 byte b4 = 20;
		 //int data6 = b4; //컴파일러가 내부적으로 암시적 형변환
		 int data6 = (int)b4;
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		char cha = 7000; // 7000 은 정수리터럴의 범위를 벗어나지 않았다 
		                 // The literal 값에 범위에 대한 오류는 아니다 
	   //cha = 80000;    //80000값은 정수리터럴 범위에 있다 >> Type mismatch: cannot convert from int to char
		                 //나는 오류는 값의 범위를 넘어서면 타입에 변환에 대한 오류를 발생 시킨다
		cha = (char)80000;
		System.out.println((int)cha);
		
		
		
		byte bb = 1; //1은 정수 리터럴 범위에 있다 
		bb = 127;
		//bb = 128; //128은 리터럴 범위에 있다 하지만
		            //범위값을 벗어난다 그럼 할당시 Type mismatch: cannot convert from int to byte
		
		
		int i2 = 100;
	    int i3 = 1000000000;
	    //int i4 = 10000000000; //The literal 10000000000 of type int is out of range 
	    //int i5 = 10000000000L;//Type mismatch: cannot convert from long to int
	    int i6 = (int)10000000000L;
		
	    //***정수리터럴의 기본 타입은 int 형입니다 (int 형 범위값을 리터럴로 표현가능합니다)***
	    
	    //long l2 = 10000000000; //The literal 10000000000 of type int is out of range 
	    long l2 = 10000000000L;  
	    
		 
	    byte b  = 125;   //125는 정수 리터럴 범위에 있다 .
		//byte b2 = 128; //Type mismatch: cannot convert from int to byte
		b = (byte) (b + 1); //정수 연산 기본은 int 형이다 ...
		System.out.println(b);
		
		
		b = 127;
		System.out.println(b);
		b = (byte)128; //정수 리터럴 범위에 있다 .... 할당시 문제 발생 ... 그럼 타임을 맞추어서 ...
		System.out.println("b :" + b);
		//https://cafe.naver.com/erpzone/50 참조
		
		
		
	}

}







