
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
		간단한 사칙 연산기 (+ , - , * , /)
		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		목적 : Integer.parseInt() ,  ** 구글 java equals() 활용  문자열의 비교** 

		화면
		>입력값:숫자
		>입력값(기호): +
		>입력값:숫자 
		>연산결과 :200
		-------------
		>입력값:100
		>입력값(기호): -
		>입력값:100
		>연산결과 :0
		
		hint)
	   ■ if문은 조건값이 boolean형, 
	   ■ switch문은 정수형(byte, short, int)과 문자형(char), 문자열(String)
       ■ long, boolean, float, double형 사용 불가
       
        Scanner sc = new Scanner(System.in);
		String ch =   sc.nextLine();
       	switch (ch) {
		case "+":System.out.println("+ 입니다");
			break;
		default: System.out.println("다른 문자 입니다");
			break;
		}
		
	    **문자열의 비교는  == 을 쓰지 않아요** 
	    WHY ) 지금 알면 아퍼요 그래서 조금 뒤에 ...
	    그래서 일단 
	    String str = "+"; 이런 값이 있다면
	    if(str == "+") 하지 마시고 
	    if(str.equals("*")) 하시면 됩니다  ㅜㅜ 잠깐 동안 암기해 주세요 이유는 나중에 알려드릴게요
	    
	    답은 String 클래스 별도 학습 할때 이유에 대한 답은 ...
	*/	
	}

}
