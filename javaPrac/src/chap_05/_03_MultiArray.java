package chap_05;

public class _03_MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multi dimensional Array  
		// 2차원 배열
		// 소규모 영화관 좌석 A1-A5 B1-B5 C1-C5
		
		String[] seatB = {"A1","A2","A3","A4","A5"};
		String[] seatA = {"B1","B2","B3","B4","B5"};
		String[] seatC = {"C1","C2","C3","C4","C5"};
	
		String[][] seats = new String[][] {
			{"A1","A2","A3","A4","A5"},
			{"B1","B2","B3","B4","B5"},
			{"C1","C2","C3","C4","C5"}
		};
		
		// B2 접근하기 
		System.out.println(seats[1][1]);
		
		//3차원 배열 만들기
		String[][][] marray = new String[][][] {
			{{},{},{}},
			{{},{},{}},
			{{},{},{}}
		};
	}

}
