import kr.or.kosa.common.Car;

/*
클래스 == 설계도 == 타입(사용자 정의)

클래스의 구성 요소 (설계도라고 판단 할려면 최소한 무었을 가지고 있어여 한다)
[필드 + 메서드] + 생성자 
(속성 + 함수(기능)

필드 (member field) >> 데이터 ,자료 정보를 담고있다 >> [고유정보]  , [상태정보]  , [부품정보] ^^ >> field >> variable
함수 (method) >> 기능(행위) >> 자동차 >> 달린다 , 멈춘다 , 소리가 난다 , 문을 연다......
+ 추가적으로 생성자(함수) >> 특수한 목적의 함수 >> 객체 생성시 member field 초기화 목적 생성되는 함수 , getter ,setter (read, write)
class 설계도 {
   고유정보
   상태정보
   부품정보
   
   기능(행위)
 }  연습이 정말 필요하다 ^^
 
 클래스 , 필드 , 생성자함수 , 메서드 : 영역 (범위) >> 생성되는 장소(위치) or 접근자 (한정자 , 수정자)
 
 장소(위치) : 폴더(package)를 기반 으로 ... 클래스 내부 , 함수 내부 , 제어문 내부
 접근자    :  public,  private , default , protected 


kr.or.kosa.common 안에 생성한 Car 클래스는        > public class Car() >> 나 다 오픈할거야
kr.or.kosa.common 안에 생성한 AirPlane 클래스는   > class AirPlane { } >> 같은 폴더 안에서만 사용

>> default 같은 폴더에서만 공유 (같은 package 에서만 사용)
>> 연습용으로 .... 또는 특정클래스의 도움을 주는 클래스 생성시 

 
 연습용으로 빠르게 작업 ..... 편할까
 하나의 물리적 Java파일은 여러개의 클래스를 가질 수 있다
 >> Ex01_Main.java 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다
 1. 개발에서는 필요한 클래스는 package 생성하고 그안에 만들어 사용합니다  Car 클래스 처럼
 2. 그냥 연습 ... 굳이 폴더 생성... 물리적파일 여러개 만들 필요가 있을까 
 3. 하나의 물리적 파일에 여러개의 클래스를 만들어 쓸 수 있게 해줄까 (연습 ....)
 3.1  대신에 public 접근자는 한 놈 .... 
 

*/
class Emp{  // 연습할때나 공부할때 .....
	
}

class Dept{     //컴파일러가 default class Dept 해석
	int deptNo; //컴파일러가 default int deptNo 해석
	public String dname; //에러는 아니지만  다른 폴더 사용 불가 (클래스 default ) public 의미 없다
	private int count;   // private 캡슐화(은닉)  감추다 , 숨기다 , 
	                     // 설계자의 의도 : 클래스 내부에서만 사용 목적
	                     // 설계자의 의도 :직접 할당을 막고 간접할당을 할동의 제어 하겠다
	
	//특수한 함수
	//getter (읽기 전용) , setter(쓰기 전용)
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) { //간접할당
		if(count < 0) {
			this.count = 0; 
		}else {
			this.count = count;
		}
		
	}
	
}

//class Apt{
	
//}

/*
폴더
kr.or.kosa.dto.Test

public class Test {
	private int i;
	
	public void setI(int i){
		this.i = i;
	}
	public int getI(){
		return this.i;
	}
	public void print(){
	
	}
}

*/
//연습용
class Test{   //default
	int i;	  //default
	
	void print() { //default
		for(int i = 0 ; i <= 100 ; i++) {
			
		}
	}
}



public class Ex01_Main {

	public static void main(String[] args) {
		//같은 폴더 안에 있는 클래스 ...
		Apt apt = new Apt();
		//kr.or.kosa.common.Car car = new kr.or.kosa.common.Car(); // public class Car {} 폴더의 구분없이 어디서나 사용가능하다 
		Car car = new Car(); 
		
		Dept dept = new Dept();
		//dept.count  (캡슐화)
		dept.deptNo =100;
		System.out.println(dept.deptNo);
		
		dept.dname = "IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.getCount());
				
	}

}
