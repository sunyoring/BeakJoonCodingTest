package Level1;

import java.util.Scanner;

public class Test6 {
	//윤년 판별
	
	//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
	//하지만, 2000년은 400의 배수이기 때문에 윤년이다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		
		int result = year % 4 == 0 ?  (year % 100 == 0 ? (year % 400 == 0 ?  1 : 0 ) : 1) : 0;
		
		int result2 = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ?  1 : 0 ; 
		
		System.out.println(result);
		System.out.println(result2);
	}

}
