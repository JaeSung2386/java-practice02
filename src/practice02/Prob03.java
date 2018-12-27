package practice02;

public class Prob03 {

	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	public static void replaceSpace(char a[]) {
		for(int n = 0; n < a.length; n++) {
			if(a[n] == ' ') {
				a[n] = ',';
			}
		}
	}
	public static void printCharArray(char a[]) {
		for(int n = 0; n < a.length; n++) {
			System.out.print(a[n]);
		}
		System.out.println();
	}
}
