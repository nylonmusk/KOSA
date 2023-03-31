import kr.or.kosa.Emp;

public class Ex02_Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		int value; //선언 초기화 되지 않았다
		value = 100; //할당 (100 초기화)
		
		int age = 99; //선언과 할당을 동시에 (99 초기화)
		
		//초기값 정의(초기화) : 변수의 초기화 :  변수가 [처음 값]을 갖는 것 (할당을 통해서)		
		
		int num = 0;
		System.out.println(num); //The local variable num may not have been initialized
		
		//지역변수는 사용시 반드시 초기화를 해야 한다 ***
		//지역변수(local variable)는 무조건 초기화 하고 사용한다 
		
		Emp emp; //선언  emp 지역변수
		//System.out.println(emp);
		emp = new Emp(); //new 연산자 메모리에 올리는 작업  >> 초기화 작업  >> heap 생성된 객체의 주소값(x번지)
		//설계도와 똑같은 집을 짓는다(메모리에)
		System.out.println(emp); //kr.or.kosa.Emp@626b2d4a
		
		// . 주소를 찿아가는 연산자
		System.out.println(emp.empno); //default 값 0이 출력
		

		int a , b , c; //같은 타입의 변수를 나열  > 개발자 생각 > 배열(Array) int[] a
		//초기화 되어 있지 않아요
		//사용
		a = 100;
		b = 200;
		c = 300; //사용가능
		
		int data=100;
		//int data; 같은 지역내에서 같은 변수명은 존재할 수 없어요
		
		int result = a + b; //초기화
		System.out.println("result 값은 " + result);
		
		
		int k = 100;
		int y = k;
		y = 200;
		
	}

}

/*
블럭주석

클래스 == 설계도 == 데이터 타입 명제는 ^^

클래스의 종류
1. class Car {} > main 함수를 가지고 있지 않은 클래스 > 독자적인 실행이 불가능 > 다른 클래스에 도움을 주는 클래스(lib)
2. class Car { public static void main(String[] args){} } > main함수를 가지고 있는 클래스 > 독자적인 실행 가능
3. 현재는 main함수를 가지고 있는 클래스가 있어야 결과를 확인 할 수 있다
4. public static void main(String[] args) >> static (new 없이도 메모리에 생성) >> 함수의 이름 (main) :시작점,진입점 >> 약속

TIP)
C# 코드 >> class Car { public static void Main(String[] args){} }

변수 : variable
데이터 (자료) 담을 수 있는 공간(메모리)의 이름
공간(크기) >> 데이터 타입(자료형) >> 메모리의 공간이 한정 >> 최소한의 공간 최대한 데이터 표현
int data =100;


변수가 선언되는 위치(scope : 유효범위)
1. instance variable : 객체변수(클래스안에)  >> class Car { public int door;}
2. local variable : 지역변수 (함수안에)     >> class Car { public void run(){ int data=0; } }
3. static variable : 공유자원 (객체간)      >> class Car {public static int num;}
4. 함수안에 있는 제어블럭 안에 있는 변수 (if , for) 블럭변수 >> class Car {  void run(){ for(int i=0...  }  for(int i=0...  }   }
*/
