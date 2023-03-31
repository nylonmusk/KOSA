
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		 다차원 배열 (2차원)
		 [행][열] 
		 영화관 좌석 , PC방 좌석 , 지도 좌표값(경도 , 위도) , 오목 , 엑셀 
		  
		 */
		int[][] score = new int[3][2];
		//3행 2열 배열
		//첨자 0
		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;
		
		//제어문 : for문
		//중첩 for
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 2 ; j++) {
				System.out.printf("score[%d][%d]=[%d]\t", i,j,score[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < score.length ; i++ ) {
			for(int j = 0 ; j < score[i].length ; j++) {  //score[i].length 이해하기 ...
				System.out.printf("score[%d][%d]=[%d]\t", i,j,score[i][j]);
			}
			System.out.println();
		}
		
		int[][] score2 = new int[][] {{11,12},{13,14},{15,16}};
		//3행 2열
		//
		//개선된 for문으로 2차원배열 출력 >> score2   for(   :    )
		//그림 ...https://cafe.naver.com/erpzone/7
		for(int[] arr : score2) {
			for(int value : arr) {
				System.out.println(value);
			}
		}
		
		
		
		

	}

}
