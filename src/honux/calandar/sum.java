package honux.calandar;
 
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		//입력은 키보드로 두 수의 입력을 받고
		//출력은 화면에 두 수의 합을 출력한다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요.");
		s1 = scanner.next();
		s2 = scanner.next();	
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		int c = a+b; 
		System.out.printf("%d와 %d의 합은 %d 입니다.", a , b , a + b);
		scanner.close();
	}

}
