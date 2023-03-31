import java.io.PrintStream;

Class Ssystem {
	// System이라는 클래스 생성
	private static final PrintStream out = new PrintStream(System.out);
}

Class Print {
	 public static void print(String str) {
		    out.print(str);
		  }
}

public class Ex14_Quiz {
	public static void main(String[] args) {
		Ssystem ssystem = new Ssystem();
		Print print = new Print();
		
	}
}
