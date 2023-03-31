package kr.or.kosa.machine;

public class ErrorMessage {
	private String errormessage;
		
		ErrorMessage(String errormessage){
			this.errormessage = errormessage;
		}
		
		void printErrorMessage() {
			System.out.println(this.errormessage);
			System.out.println("다시 금액을 투입하여주십시오.");
			System.out.println();
		}
}
