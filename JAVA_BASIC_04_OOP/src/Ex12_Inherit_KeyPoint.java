/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라 전자제품 매장이 오픈되면

[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 모든 제품이 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름정보를 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다 (ex) Tv , Audio , Computer
각각의 전자제품은 다른 가격정보를 가지고 있다( Tv:5000 , Audio : 6000)
제품의 포인트는 가격의 10%적용한다

시뮬레이션 시나리오
구매자: 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
ex) 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게 되면 가지고 있는 돈은 감소하고 (가격) 포인트는 증가한다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Product {
	int price;
	int bonuspoint;

	// Product() { }
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}

}

class KtTv extends Product {
	KtTv() {
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(150);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}
}

// 구매자
class Buyer {
	int money = 5000;
	int bonuspoint;

	// 기능 구매기능
	// 제품을 구매 할 수 있는 기능 (3개 구매가능)
	// 내 잔액서 - 제품의 가격, 포인트 갱신 +)
	void kttvBuy(KtTv n) { // 함수의 parameter로 제품객체를 받아서 (가격, 포인트)
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^ " + this.money);
			return;	// 함수의 종료(강제)
		}
		 // 실 구매행위
		 this.money -= n.price;
		 this.bonuspoint += n.bonuspoint;
		 System.out.println("구매한 물건은 : " + n.toString());
	}
	void audioBuy(Audio n) { // 함수의 parameter로 제품객체를 받아서 (가격, 포인트)
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^ " + this.money);
			return;	// 함수의 종료(강제)
		}
		// 실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	void noteBookBuy(NoteBook n) { // 함수의 parameter로 제품객체를 받아서 (가격, 포인트)
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^ " + this.money);
			return;	// 함수의 종료(강제)
		}
		// 실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
}

/*
 * 	1차오픈...
 * 팀장 >> 하와이 휴가....
 * 
 * 매장에 제품 더 구매 1000개 제품추가 (마우스, 토스트기, 청소기)... POS (자동 등록:제품)
 * 매장에 1000개의 제품 전시 ....
 * 업체 전단지 주말 오픈세일 .....
 * 1. 오픈 3개 구매 >> 997제품 구매가 안돼요
 * >> 팀장 >> 하와이 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 이틀 밤새워 >> 구매함수 997 추가
 * 
 * 다형성은 코드량을 감소시킨다 ^^(hint)
 */


public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.audioBuy(audio);
		buyer.noteBookBuy(notebook);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);

	}

}
