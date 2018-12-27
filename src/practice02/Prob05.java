package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int num1 = 1, num2 = 100;
		Scanner scanner = new Scanner(System.in);
		int input;
		
		//무한 루프
		for(int i = 1; ; i++) {
			System.out.println(num1 + "-" + num2);
			System.out.print(i + ">>");
			input = scanner.nextInt();
			
			//입력값이 랜덤 값보다 작음
			if(input < k) {
				System.out.println("더 높게");
				num1 = input;
			} 
			//입력값이 랜덤 값보다 큼
			else if(input > k) {
				System.out.println("더 낮게");
				num2 = input;
			}
			//맞췄을 경우
			else if(input == k) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				
				//종료
				if(answer.equals("n")) {
					System.exit(0);
				}
				//다시 시작
				else if(answer.equals("y")) {
					num1 = 1;
					num2 = 100;
					i = 0;
					k = r.nextInt(100) + 1;
				}
			}
		}//for
	}//main
}
