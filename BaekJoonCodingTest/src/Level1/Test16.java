package Level1;

import java.util.Scanner;

public class Test16 {
/*
 * 문제
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	출력
	각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int a[] = new int[t];
		int b[] = new int[t];
		
		
		for(int i = 0; i < t; i++) {

			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i<t; i++) {
			System.out.println("Case #"+(i+1)+": " + a[i] +" + " +b[i] + " = " + (a[i]+b[i]));
		}
		

		
	}

}