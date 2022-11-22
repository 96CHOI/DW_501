package cafe.control;

import java.util.Scanner;

public class signin implements menu_able{ //회원가입

	@Override
	public boolean menu_active() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 양식");
		
		//==========================
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("연락처 : ");
		String tel = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		
		//==========입력항목===========
		
		
		return true;
	}

}
