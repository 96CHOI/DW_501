package cafe.BO;

import cafe.DAO.member_DAO;

public class member_service {
	private member_DAO mdao = new member_DAO();

	public boolean login(String id, String tel) {
		boolean chk = mdao.login(id, tel);
		if (chk) {
			mdao.login(id, tel);
			System.out.println("입력한 정보는 없는 정보입니다.");
			return true;
		} else
			System.out.println(id + "님 환영합니다.");
			return false;
	}

	public boolean sign_member(String id, String name, String tel, String email) {
		boolean check = mdao.id_check(id, email);
		// id_check 메서드를 통해 아이디와 이메일이의 중복여부 확인 중복이면 회원가입 안됨
		if (check) { // 중복이라면
			System.out.println("이미 가입된 정보입니다. 다시 확인 후 진행해주세요.");
			return false; // 로그인 실패 - 아이디, 비번 틀렸거나 없는경우
		} else // 중복이 아니라면
			mdao.member_insert(id, name, tel, email);
			System.out.println("회원가입이 완료되었습니다.");
			return true;
	}
}
