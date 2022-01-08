import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위:1번, 바위:2번, 보:3번 숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		int srp = (int) ((Math.random() * 3)+1);
		
		if(num == 1 && srp == 2 || num == 2 && srp == 3 || num == 3 && srp == 1) {
			System.out.println("사용자: " + num);
			System.out.println("컴퓨터: " + srp);
			System.out.println("졌습니다.");
		} else if (num == 1 && srp == 3 || num == 2 && srp == 1|| num == 3 && srp == 2) {
			System.out.println("사용자: " + num);
			System.out.println("컴퓨터: " + srp);
			System.out.println("이겼습니다.");
		} else {
			System.out.println("사용자: " + num);
			System.out.println("컴퓨터: " + srp);
			System.out.println("비겼습니다.");
		}
		
		sc.close();
		
	}

}
