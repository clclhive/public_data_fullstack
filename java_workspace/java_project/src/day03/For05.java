package day03;

import java.util.Scanner;

public class For05 {

  public static void main(String[] args) {
    /* 공약수 " 두 수의 약수 중 공통된 약수
     * 
     */
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("첫번째 숫자 입력");
    int num1 = sc.nextInt();
    System.out.println("두번째 숫자 입력");
    int num2 = sc.nextInt();
    
    int gsn = 1; //최대 공약수
    
    int min = (num1 < num2) ? num1 : num2;
    
    for(int i = min ;; i--) {
      if(num1 % i == 0 && num2 % i ==0) {
        gsn = i;
        break;
      }
      /*
       * while(true){
       * if(num1 % i == 0 && num2 % i ==0) {
         gsn = i;
         break;
         }
         i--;
         }
       */
    }
    for(int i = 1; i <=gsn; i++) {
      if(gsn%i ==0) {
        System.out.print(i+" ");        
      }
    }
    
    System.out.println("최대공약수: "+gsn);
    
    System.out.println("-------------------");
    
    int num3 = 50;
    int num4 = 20;
    int gcd=0;
    
    for(int i = 1; i <=num2;i++) {
      if(num3%i==0 && num4%i==0) {
        System.out.println(i);
        gcd = i;
      }
    }
    System.out.println("최대공약수: "+gcd);
    
    sc.close();
    

  }

}
