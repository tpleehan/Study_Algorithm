import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����:1��, ����:2��, ��:3�� ���ڸ� �Է����ּ���: ");
		int num = sc.nextInt();
		
		int srp = (int) ((Math.random() * 3)+1);
		
		if(num == 1 && srp == 2 || num == 2 && srp == 3 || num == 3 && srp == 1) {
			System.out.println("�����: " + num);
			System.out.println("��ǻ��: " + srp);
			System.out.println("�����ϴ�.");
		} else if (num == 1 && srp == 3 || num == 2 && srp == 1|| num == 3 && srp == 2) {
			System.out.println("�����: " + num);
			System.out.println("��ǻ��: " + srp);
			System.out.println("�̰���ϴ�.");
		} else {
			System.out.println("�����: " + num);
			System.out.println("��ǻ��: " + srp);
			System.out.println("�����ϴ�.");
		}
		
		sc.close();
		
	}

}
