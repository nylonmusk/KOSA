package kr.or.kosa.machine;

public class CookDish {
		public String cookDishInfo;
		//조리준비중  //조리중  //조리완료
		public CookDish(String cookDishInfo) {
			this.cookDishInfo = cookDishInfo;
		}	
		public void printCookDish() {
			System.out.println("현재상태 " + cookDishInfo);
		}
		
	}

