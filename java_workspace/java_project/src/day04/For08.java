package day04;

public class For08 {

  public static void main(String[] args) {
    /* 구구단 전체 (2단~9단) 출력
     * 2*1=2...2*9=18
     * ...
     * 9*1=9...9*9=81
     */
    
    int dan = 4;
    for(int i =1 ; i <=9 ; i++) {
      System.out.println(dan+"*"+i+"="+(dan*i));
    }
    System.out.println("----------------------");
    
    for(int i = 2 ; i<=9 ; i++) {
      for(int j = 1 ; j <= 9 ; j ++) {
        System.out.println(i+"*"+j+"="+(i*j));
      }
      System.out.println();
    }
    
    /* 2*1=2 3*1=3 ... 9*1=9
     * 2*2=4            ...
     * ...              ...
     * 2*9=18          9*9=81
     */ 
    
    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
          System.out.printf("%d * %d = %2d   ", j, i, j * i);
      }
      System.out.println();
  }

  }

}
