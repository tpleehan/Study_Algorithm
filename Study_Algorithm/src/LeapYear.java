import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ش� �⵵ �Է�: ");
		int year = sc.nextInt();

		if(year % 4 == 0) {
			System.out.println("���� �Դϴ�.");
		} else if(year % 100 == 0 || year % 400 == 0) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}

		sc.close();
		
	}

}
