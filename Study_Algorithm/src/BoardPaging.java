import java.util.Scanner;

public class BoardPaging {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ѰǼ� �Է�: ");
		int m = sc.nextInt();
		System.out.print("���������� ������ �Խù� �Է�: ");
		int n = sc.nextInt();

		if (m % n == 0) {
			System.out.println("���: " + m / n + " �� ������ ��");
		} else {
			System.out.println("���: " + (m / n + 1) + " �� ������ ��");
		}
		
		sc.close();
	}

}
