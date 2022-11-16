package 자바1115;

import java.util.ArrayList;
import java.util.List;

public class Home {
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
	
	List<Emp> WordList = new ArrayList<Emp>();
	WordList.add(sawon1);
	WordList.add(sawon2);
	WordList.add(sawon3);
	WordList.add(sawon4);
	WordList.add(sawon5);
	WordList.add(sawon6);
	WordList.add(sawon7);
	WordList.add(sawon8);
	WordList.add(sawon9);
	WordList.add(sawon10);
	
	int result = 0;
	int res = 0;
	int count = 0;
	int max = 0;
	String name = "";
	String job = "";
	
	for ( Emp 사원 : WordList ) {
		result += 사원.sal;
		if(사원.job.equals("MANAGER")&&사원.sal>=2500) {
			count++;
		}
		if(사원.sal > max) {
			max = 사원.sal;
			name = 사원.ename;
			job = 사원.job;
		}
		
	}
	res = result / WordList.size();
	System.out.println("직원 총 급여 : " + result + "원");
	System.out.println("직원 평균 급여 : " + res + "원");
	System.out.println("조건맞는 직원 수 : " + count + "명");
	System.out.println("최대 급여 사원 : 이름 - " + name + ", 직업 - " + job);
		
	}
}
