package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception : 명시적 예외처리가 필요
public class ExceptionEx3 {
	int str;

	public ExceptionEx3()/* throws IOException */ {
		input();
	}

	public void input() /* throws IOException */ {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열을 입력하세요");
		try{str=Integer.parseInt(br.readLine());}
		catch (IOException e) {
			System.out.println("입력된 값에 문제가 있는듯....1");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("입력된 값에 문제가 있는듯....2");
		}catch (Exception e) {// 이게 가장 윗줄에 나오면 IOException 등등의 예외들이 
			//하위 개념이라 이미 Exception에의해 처리가 되어 에러남. 따라서 Exception을 가장 아래 배치해준다.
				System.out.println("입력된 값에 문제가 있는듯....3");
	}
	}
	public void output() {
		System.out.println("결과 : "+str);
	}

	public static void main(String[] args)/* throws IOException */ {
		new ExceptionEx3().output();
		System.out.println("---------------------");
	}

}
