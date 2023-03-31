package kr.or.kosa.dto;

import java.util.Scanner;

/*
 로또 시스템 class 설계 하세요 ^^
 목적 : 클래스의 구성 요소를 이해하고 활용 할 수 있다
 member field , constructor (초기화) , method 활용
 접근자 한정자의 사용 , ....
 기능을 함수 단위로 분리 할 수 있다 ^^
 함수의 return type 과 parameter 를 활용할 수 있다
 
 결국 Ex07_Array_Lotto_Quiz main함수 있는 내용을 별도의 기능으로 구현하세요
 
 그러면
 Ex08_Lotto 의 main 함수안에서
 
 Lotto lotto = new Lotto();
 lotto.start(); 
 이런식으로 실행하면
 메뉴가 나오고  .... 선택시 번호 추출하고 ..... 선택시 종료 되는 기능을 구현하시면 됩니다
 
 
*/
public class Lotto {
	//아래와 같이 ....
	private Scanner scanner;
	public Lotto() {
		scanner = new Scanner(System.in);
	}
	
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 당첨 예상 번호 추출하기**");
		System.out.println("**2. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 :");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	//여러가지 기능을 가지는 함수를 생성 활용하세요
	// 기능 >> method >> 함수 하나당 기능 하나
	// public >> 참조변수
	// private >> 내부 사용 (공통)
	// 실번호 추출해 주세요
	// 중복값 나오면 안되요
	// 낮은 순으로 정렬해 주세요
	// 화면에 출력해 주세요
	// 메뉴 기능을 만들어 주세요
	
}
