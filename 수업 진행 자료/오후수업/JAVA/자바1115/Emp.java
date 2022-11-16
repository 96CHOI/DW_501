package 자바1115;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	String ename; //사원이름
	int sal; // 급여
	String job; // 직업
	
	//필드변수를 초기화할 수 있는 생성자 만들기
	//쉽게 만드는법 Source -> 아래서 4번째 -> 제너레이트
	public Emp(String ename, int sal, String job) {
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	public static void main(String[] args) {
		
		Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		//문제2. 직원 총 급여 구하기
		//문제3. 직원 평균 급여 구하기
		//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기
		//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기
	}
	
	
}


