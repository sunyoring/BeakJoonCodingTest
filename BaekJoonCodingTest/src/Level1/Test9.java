package Level1;

import java.util.Scanner;

public class Test9 {
	/*
	문제
	N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

	입력
	첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
	*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
	}

}
