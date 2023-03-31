/*
static  초기화
1. static variable   : 공유자원 (객체간 공유자원) : 객체마다 같은 값을 공유할 거야
2. instance variable : 생성되는 객체마다 다른 값을 가지게 하겠다 

두 자원은 default 값 
초기화는 필요에 할 수 있고 안할 수 도 있고


*/
class Test2{
	static int cv = 10; //초기화
	static int cv2; //default 0
	int iv = 9;
	// 3 녀석은 default 값이 있어서 초기화를 하지 않아도 사용하는 데 문제 없다
	
	//for(int i)
	
	
	//1. static 자원 초기화 블럭   static { }
	static {
		//실행되는 시점 : static int cv = 10 , static int cv2 메모리에 올라간 직 후 자동 호출(실행)
		cv = 1111;
		//**조작된 표현이 가능 ** (제어문)
		cv2 = cv + 2222;
	}
	
	//2. 일반 자원 (member field) 초기화 블럭  {}  >> 생성자 함수와 기능이 동일 (인기가.....)
	{
		//int iv = 9; 메모리 >> 선행 >> Test2 test2 = new Test2();
		//  { } 초기화 블럭 언제 ... member field 가 heap 올라간 직후  블럭 실행
		//조작된 값을 사용하지 못해요
		//if(iv > 10 ) iv = 100;
		System.out.println("초기화 블럭 실행");
		if(iv < 10) iv = 10000;
	}
}

public class Ex07_Static_init {

	public static void main(String[] args) {
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
	
		Test2 test = new Test2(); 
		System.out.println(test.iv);
		

	}

}
