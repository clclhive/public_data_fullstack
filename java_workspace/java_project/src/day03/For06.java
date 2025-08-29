package day03;

import java.util.Scanner;

public class For06 {

  public static void main(String[] args) {
    /*
     * 배수 : 값을 1부터 곱해서 나오는 값 10의 배수 20의 배수 끝도 없이 나옴
     * 
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 숫자 입력");
    int num1 = sc.nextInt();
    System.out.println("두번째 숫자 입력");
    int num2 = sc.nextInt();

    int msn = 1; // 최소 공배수

    int max = (num1 > num2) ? num1 : num2;

    for (int i = max;; i++) {
      if (i % num1 == 0 && i % num2 == 0) {
        msn = i;
        break;
      }
    }
    System.out.println("최소공배수 : " + msn);

    System.out.println("-----------------------------");

    int msn2 = 1;
    boolean fdmsn2 = false;

    for (int i = max; !fdmsn2; i++) {
      if (i % num1 == 0 && i % num2 == 0) {
        msn2 = i;
        fdmsn2 = true;
      }
    }
    System.out.println("최소공배수 : " + msn2);

  }

}
