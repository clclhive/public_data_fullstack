package day01;

public class Operator {

	public static void main(String[] args) {
		// 연산자(Operator)
		// 사칙연산자 ( + - * / %) : () 우선순위
		// 대입연산자 (= += -=)
		// 왼쪽은 반드시 변수
		
		int a = 1;
		int b = 2;
		// a = b; // 1은 사라지고 b의 2값이 a로 저장
		// 누적
		a += b; // a = a + b;
		System.out.println(a);
		
		// 1씩 증가
		int c = 0;
		c += 1; // c = c + 1; , c++ c--
		
		// 사직연산자 : + - * %(나머지) /
		// + : 숫자가 아닐 때는 연결연산자 바뀜. 문자 + 숫자
		
		System.out.println("숫자" + 3+5);
		// 나누기( / % )
		// 정수 / 정수 = 정수 (10 / 3 = 3)
		// 정수(실수) / 실수 = 실수 (10 / 3.0 = 3.3333)
		
		// 정수 / 0 => 예외발생(Exception)
		// 실수 / 0 => infinity 발생(오류는 아님)
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(); // syso + (crtl+space)
		//System.out.println(10/0); 정수를 0으로 나누면 안됨
		
		
		

	}

}
