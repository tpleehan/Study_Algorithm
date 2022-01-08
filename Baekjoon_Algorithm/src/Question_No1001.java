/**
 * 문제 1001번
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력
 * 첫째 줄에 A-B를 출력한다.
 * 
 * 예제 입력 1
 * 3 2
 * 
 * 예제 출력 1
 * 1
 */

import java.util.Scanner;


public class Question_No1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A 입력> ");
		int a = sc.nextInt();
		System.out.print("B 입력> ");
		int b = sc.nextInt();
		
		System.out.println("A - B의 합계: " + (a - b));
		
		sc.close();
		
	}
	
}