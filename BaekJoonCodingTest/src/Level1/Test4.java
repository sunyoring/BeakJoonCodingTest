package Level1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		int numA = Integer.parseInt(strArr[0]);
		int numB = Integer.parseInt(strArr[1]);
		
		String result= (numA > numB ? ">":(numA < numB ? "<" : "=="));
		
		System.out.println(result);
		
		
	}

}
