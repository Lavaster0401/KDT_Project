package project0812;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //1부터 N까지의 짝수 합과 홀수 합 구하기
        Scanner sc = new Scanner(System.in);

        System.out.print("N 값 입력: ");

        int n = sc.nextInt();

        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            } else {
                odd_sum += i;
            }
        }

        System.out.println("1부터 " + n + "까지의 짝수 합: " + even_sum);
        System.out.println("1부터 " + n + "까지의 홀수 합: "+ odd_sum);

        sc.close();
    }
}
