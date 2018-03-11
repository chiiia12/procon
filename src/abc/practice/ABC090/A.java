package abc.practice.ABC090;

import java.util.Scanner;

public class A {

  static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    String answer = "";
    for (int i = 0; i < 3; i++) {
      String a = sc.next();
      answer += a.substring(i, i + 1);
    }
    System.out.println(answer);
  }
}
