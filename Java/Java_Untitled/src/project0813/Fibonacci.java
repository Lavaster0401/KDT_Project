package project0813;
import java.util.Scanner;

public class Fibonacci {
    // 재귀 메소드로 피보나치 수열 구현해보기
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // 기본 조건 1
        }
        if (n == 1) {
            return 1;  // 기본 조건 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // 재귀 호출
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 번째 피보나치 수를 구하고 싶으십니까? : ");
        int n = sc.nextInt();

        System.out.println( n + "번째 피보나치 수는: " + fibonacci(n) + "입니다.");

        sc.close();
    }
}
