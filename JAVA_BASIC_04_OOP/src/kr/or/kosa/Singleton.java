package kr.or.kosa;
/*
디자인 패턴 (생성에 관련된 이야기) >> new


의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라


공유프린터
공유 IP

Singleton s = new Singleton();

*/
public class Singleton {
	public static Singleton instance;
	private Singleton() {
		// 생성자 접근자 private >> 생성자 호출하지 못해서 객체 new 하지 못하게 ...
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
