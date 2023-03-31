import kr.or.kosa.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		/*
		AirPlane air1 = new AirPlane();
		air1.makeAirPlane(101, "대한항공");
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(102, "아시아나");
		air2.airPlaneTotalCount();
		*/
		
		//AirPlane.airtotalcount   static private 접근불가 (간접)
		//air1.airtotalcount   막았어요 
		
		AirPlane air1 = new AirPlane(101, "대한항공");
		air1.airDisplay();
		air1.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(707, "아시아나");
		air2.airDisplay();
		air2.airPlaneTotalCount();
	}

}
