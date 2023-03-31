package kr.or.kosa.machine;

public class Topping {
	int addIngredient; //추가 재료
	String add;
	//String addIngredient2; //추가재료...배열필요....
	//String addIngredient3;
	int addpay;
	public Topping(){ //기본메뉴
		this(1); //기본 치즈 토핑  
	}
	
	Topping(int addIngredient){
		this.addIngredient = addIngredient;
		
		if (addIngredient ==1)
		{
			this.add = "치즈";
			System.out.printf("%s 선택하셨습니다.",add);
			addpay += 500;
		}
		else if (addIngredient ==2)
		{
			this.add = "계란";
			System.out.printf("%s 선택하셨습니다.",add);
			addpay += 300;
		}
		else if (addIngredient ==3)
		{
			this.add = "소시지";
			System.out.printf("%s 선택하셨습니다.",add);
			addpay += 1000;
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
/*	
	Topping(String addIngredient, String addIngredient2){
		this.addIngredient = addIngredient;
		this.addIngredient2 = addIngredient2;
		System.out.printf("%s ,%s 선택하셨습니다.",addIngredient,addIngredient2);
	}
	
	Topping(String addIngredient, String addIngredient2,String addIngredient3){
		this.addIngredient = addIngredient;
		this.addIngredient2 = addIngredient2;
		this.addIngredient3 = addIngredient3;
		System.out.printf("%s , %s ,%s 선택하셨습니다.",addIngredient, addIngredient,addIngredient2);
	}
*/

}
