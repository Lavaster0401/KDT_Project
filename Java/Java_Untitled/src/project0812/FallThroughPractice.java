package project0812;

import java.util.Scanner;

public class FallThroughPractice {
    public static void main(String[] args) {
        //실무에서 많이 쓰지는 않음
        Scanner sc = new Scanner(System.in);

        System.out.print("요일 번호를 입력하세요 (1=월, 2=화, 3=수): ");
        int day = sc.nextInt();

        System.out.println("\n=== break 있는 버전 ===");
        switch (day) {case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("주말");
        }

        sc.close(); //스캐너는 쓰고 나면 닫아줘야 함
    }
}