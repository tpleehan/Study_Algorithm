import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("해당 년도 입력: ");
		int year = sc.nextInt();

		if(year % 4 == 0) {
			System.out.println("윤년 입니다.");
		} else if(year % 100 == 0 || year % 400 == 0) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}

		sc.close();
		
	}

}
