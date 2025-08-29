package day02;

import java.util.Scanner;

public class If02 {

  public static void main(String[] args) {
    /*
     * 국어,영어, 수학 점수 입력 받아 합계, 평균, pass여부 출력 pass 기준은 평균이 80 이상 - if return; : 메서드 종료
     * 
     * method return void => 리턴 값이 없음
     */

    Scanner scan = new Scanner(System.in);

    // 1. 점수입력
    System.out.print("국어 점수 입력> ");
    int kor = scan.nextInt();
    kor = (kor >= 0 && kor <= 100) ? kor : -1;

    System.out.print("영어 점수 입력> ");
    int eng = scan.nextInt();
    eng = (eng >= 0 && eng <= 100) ? eng : -1;

    System.out.print("수학 점수 입력> ");
    int mth = scan.nextInt();
    mth = (mth >= 0 && mth <= 100) ? mth : -1;

    // 한번에 점수 입력 받는 법
    // System.out.println("국어/영어/수학 순으로 입력>");
    // int kor = scan.nextInt(); 나머지 반복

    // 2. 합계, 평균 계산
    if (kor == -1 || eng == -1 || mth == -1) {
      System.out.println("점수는 0~100 사이만 입력 가능합니다.");
    } else {
      int tot = kor + eng + mth;
      double avg = tot / 3.0;

      if (avg >= 80) {
        System.out.println("합격");
      } else {
        System.out.println("불합격");
      }
    }
    scan.close();


  }

}
