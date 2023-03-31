/*
String 클래스 (문자를 여러개 담을 수 있는 클래스)
String 수 많은 함수 가지고 있다 .. 대부분의 데이터는 문자열 (자르고 , 합치고 , 나누고 .. 조합)
String >> 가지고 있는 일반함수 + static 함수 활용 (15~20) 함수 공부...
*/
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str=""; //초기화
		String[] strarr = {"abc" , "bbb" , "ccc"};
		
		for(String s : strarr) {
			System.out.println(s);
		}
		//사용방법 : int , double 값타입 처럼 부담없이 사용 
		
		String st = "홍길동";
		System.out.println(st.length()); //배열
		//[홍][길][동] >> char[] 로 관리 
		System.out.println(st); //주소 예상 >> 실제로는 값 (toString() 생략
		System.out.println(st.toString());
		//String 클래스는 Object 부모 클래스를 가지고 있고 toString() 
		//상속관계  String extends Object >> 재정의 (override) >> 주소에 가서 값을 read 해서 그 [ 값을 리턴 ]
		
		// 정식 표기
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String name="가나다라마";
		//String 내부적으로 char[] member field >> 배열 [가][나][다][라][마]
		//class String extends Object {private char[] str .......setter ..... @Override toString()}		
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열의 비교
		System.out.println(str1); //toString() 생략되 있다
		System.out.println(str2.toString()); //toString() 재정의 주소값이 아니고 값이 나오도록
		
		System.out.println(str1 == str2);
		//== 연산자는 값을 비교  str1 주소값 str2 
		//같은 주소 판명 
		//**메모리에 실제로 같은 문자열이 있으면 재사용
		//str1 과 str2 같은 메모리를 참조
		
		//POINT
		//문자열의 비교는 무조건 ... equals
		System.out.println(str1.equals(str2)); //주소를 찾아가서 그 안에 값을 비교
		
		//why : equals 
		String str3 = new String("BBB"); 
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //false 
		System.out.println(str3.equals(str4)); //true 
		
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);
		s = "A";
		System.out.println(s);
		//그래서 .. String 누적쓰면 ... 바보 ....
		//Stringbuilder , Stringbuffer 
	}

}
