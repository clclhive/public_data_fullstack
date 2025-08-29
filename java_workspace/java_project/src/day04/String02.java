package day04;

public class String02 {

  public static void main(String[] args) {
    // toLowerCase() / toUpperCase() : 대소문자 변환
    System.out.println("abc".toUpperCase());//대문자로 변환하세요
    System.out.println("ABc".toLowerCase());//소문자로
    System.out.println("--------------");
    
    // isEmpty() : 값이 비어있는 지 확인
    System.out.println("".isEmpty()); // true
    System.out.println("------------------");
    
    // trim() : 불필요 공백 제거
    System.out.println("            hello   ".trim());
    System.out.println("------------------");
    
    // replace() : 글자 치환,변환
    String str = "apple,banana,kiwi,orange";
    System.out.println(str.replace(",","/"));
    System.out.println("---------------------");
    
    // split : 특정값을 기준으로 나누기 => 배열로 리턴
    String[] strArr = str.split(",");
    System.out.println(strArr[0]);
    for(int i = 0; i<strArr.length ; i++) {
      System.out.println(strArr[i]);
    }
    
    //향상된 for 문
    for(String s : strArr) {
      System.out.println(s);
    }
    
    System.out.println("--------------------------");
    
    //문자를 숫자로 Integer.parse.Int()
    String num = "123";
    int num2 = Integer.parseInt(num);
    System.out.println(num2+10);
    
    System.out.println("--------------------");
    
    //숫자를 문자로 변경 String.valueOf()
    
    String as = String.valueOf(num2);
    System.out.println(as);
    //instanceof : 같은 클래스가 맞는 지 확인하는 연산자(클래스타입만 가능)
    System.out.println();
    

  }

}
