
public class Press_Keypad {

	public static void main(String[] args) {
//		int[] numbers = new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//		int[] numbers = new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
//		String hand = "right";
//		String hand = "left";
		String hand = "right";
		
		/*
		 * Result*
		 Case 1 : "LRLLLRLLRRL"
		 Case 2 : "LRLLRRLLLRR"
		 Case 3 : "LLRLLRLLRL"
		 */
		String answer = "";
		
		int leftHand = 10, rightHand = 12;
		int L_dis, R_dis;
		
		for(int i = 0; i < numbers.length; i++) {
			
			L_dis = 0;
			R_dis = 0;
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				leftHand = numbers[i];
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				rightHand = numbers[i];
			}else {
				if(numbers[i] == 0) {
					numbers[i] = 11;
				}
				
				L_dis = (Math.abs(numbers[i] - leftHand) / 3) + (Math.abs(numbers[i] - leftHand) % 3);
				R_dis = (Math.abs(numbers[i] - rightHand) / 3) + (Math.abs(numbers[i] - rightHand) % 3);
				
				if(L_dis == R_dis) {
					if(hand.equals("right")) {
						answer += "R";
						rightHand = numbers[i];
					}else {
						answer += "L";
						leftHand = numbers[i];
					}
				}else if(L_dis > R_dis) {
					answer += "R";
					rightHand = numbers[i];
				}else {
					answer += "L";
					leftHand = numbers[i];
				}
			}
			
		}
		System.out.print(answer);
	}

}
