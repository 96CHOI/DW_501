package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class movie_main {

	public static void main(String[] args) {

		// 파일 불러오기, 저장하기
		// 파일 읽어오기는 반드시 예외처리가 필요함.
		// new FileReader()가 실제로 파일을 불러오고 BufferedReader 에 뿌림

		List<movieVo> list = new ArrayList<>();

		String path = "c:/test/movie.txt";

		// try 안에 있는 구문이 오류만 catch한다, 오류 날 수 있는것만 try에 넣는다.
		try (BufferedReader file = new BufferedReader(new FileReader(path)) )
		{

			while (true) {
				String line = file.readLine();
				if (line == null)
					break;
				String[] temp = line.split(" ");

				movieVo data = new movieVo(temp[0], Integer.parseInt(temp[1]), temp[2]);
				list.add(data);
			}
			//파일 닫아주기
//			file.close();
			
			for( movieVo data : list)
				System.out.println(data.toString() );
			

		} catch (Exception e) {
			System.out.println("파일 없다");
		}

//		movieVo[] arr = new movieVo[4];
//		arr[0] = new movieVo("윤도의 코딩모험",2022,"19세");
//		arr[1] = new movieVo("재영이의 코딩모험",2022,"19세");
//		arr[2] = new movieVo("종빈이의 코딩모험",2022,"19세");
//		arr[3] = new movieVo("기원이의 코딩모험",2022,"19세");
//		
//		for (movieVo i : arr)
//			i.output();

	}

}

/*
 * 영화 총 4개 입력하여 출력까지
 */