package day03;

public class Exam01 {

  public static void main(String[] args) {
    /*
     * 소수 : 약수가 1과 나 자신만 있는 수 2~100까지 3 5 7 11 13 소수만 출력
     */


    for (int i = 2; i <= 100; i++) {
      boolean tfpm = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          tfpm = false;
          break;
        }
      }
      if (tfpm) {
        System.out.print(i + " ");
      }
    }

  }

}
