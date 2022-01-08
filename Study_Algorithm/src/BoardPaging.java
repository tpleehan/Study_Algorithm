import java.util.Scanner;

public class BoardPaging {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("총건수 입력: ");
		int m = sc.nextInt();
		System.out.print("한페이지에 보여줄 게시물 입력: ");
		int n = sc.nextInt();

		if (m % n == 0) {
			System.out.println("출력: " + m / n + " 총 페이지 수");
		} else {
			System.out.println("출력: " + (m / n + 1) + " 총 페이지 수");
		}
		
		sc.close();
	}

}
