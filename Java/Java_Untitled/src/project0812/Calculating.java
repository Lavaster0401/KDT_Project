package project0812;
import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 두 개를 입력하세요 (공백 구분): ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.print("연산자 선택(+, -, *, /): ");
        char operator = sc.next().charAt(0); //맨 처음 들어오는 문자(char)를 반환

        double result = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println("계산 결과: " + result);
        sc.close();
    }
}
