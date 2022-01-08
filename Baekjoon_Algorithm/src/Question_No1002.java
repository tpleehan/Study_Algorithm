/**
 * 문제 1002번
 * 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오. 
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
 * 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다. 
 * 
 * 출력
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 * 
 * 예제 입력 1
 * 3
 * 0 0 13 40 0 37
 * 0 0 3 0 7 4
 * 1 1 1 1 1 5
 * 
 * 예제 출력 1
 * 2
 * 1
 * 0
 */

import java.util.Scanner;


public class Question_No1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스의 T
		System.out.print("테스트 케이스> ");
		int T = sc.nextInt();
		int x1, y1, x2, y2, r1, r2;
		double d;
		
		// Math.sqrt 루트 구하는 함수
		// Math.pow 제곱을 구하는 함수
		// Math.abs 절대 값을 구하는 함수
		
		for (int i = 0; i < T; i++) {
			int result;
			
			// 조규현
			System.out.print("조규현 x1> ");
			x1 = sc.nextInt();
			System.out.print("조규현 y1> ");
			y1 = sc.nextInt();
			System.out.print("조규현 r1> ");
			r1 = sc.nextInt();
			
			// 백승환
			System.out.print("백승환 x2> ");
			x2 = sc.nextInt();
			System.out.print("백승환 y2> ");
			y2 = sc.nextInt();
			System.out.print("백승환 r2> ");
			r2 = sc.nextInt();
			
			d = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
			
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				result = -1;
				
			} else if (d == r1 + r2 || Math.abs(r1 - r2) == d) {
				result = 1;
				
			} else if (Math.abs(r1 - r2) > d || x1 == x2 && y1 == y2 && r1 != r2 || d > r1 + r2) {
				result = 0;
				
			} else {
				result = 2;
				
			}
			
			System.out.println(result);
			
		} 
		sc.close();		
		
	}
	
}
