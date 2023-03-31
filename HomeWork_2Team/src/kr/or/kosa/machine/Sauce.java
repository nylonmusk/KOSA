package kr.or.kosa.machine;

import java.util.Scanner;


public class Sauce {
	int sauce;
	Scanner sc = new Scanner(System.in);
	
	public void Sauce(){
		System.out.println("맵기를 선택해주세요");
		System.out.print("1.기본  2.안맵게  3.덜맵게  4.맵게: "  );
		sauce  =Integer.parseInt(sc.nextLine());
	
		System.out.printf("맵기 %d를 선택하셨습니다.\n",sauce);
		
	}



}

