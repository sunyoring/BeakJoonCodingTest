package Level1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();

		String strB = Integer.toString(numB);

		for(int i = strB.length()-1; i >= 0 ; i--) {
		
			char[] strArr = strB.toCharArray();
			
			//char 형을 int형으로 변환하는 방법 1
			int result = numA * Character.getNumericValue(strArr[i]);
			
			//방법 2
			// 숫자 아스키코드가 48부터 시작 된다. 따라서 -48을 해주면 숫자값을 얻을 수 있다.
			
			int result2 = numA * (strArr[i]-48);

			
			
			System.out.println(result);
			System.out.println(result2);
			
			
		}
		System.out.println(numA * numB);
		
	}

}
