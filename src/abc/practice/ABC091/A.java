package abc.practice.ABC091;

import java.util.Scanner;

public class A {

  static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String answer = "No";
    if (a + b >= c) {
      answer = "Yes";
    }
    System.out.println(answer);
  }
}
