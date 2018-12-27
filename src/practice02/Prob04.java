package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	//문자열 뒤집는 메소드
	public static char[] reverse(String str) {
		char[] ch = new char[str.length()];
		
		for(int n = 0; n < str.length(); n++) {
			ch[n] = str.charAt(str.length()-n-1);
		}
		
		return ch;
	}
	//뒤집어진 char형 배열 출력하는 메소드
	public static void printCharArray(char[] array){
		for(int n = 0; n < array.length; n++) {
			System.out.print(array[n]);
		}
		System.out.println();
	}
}
