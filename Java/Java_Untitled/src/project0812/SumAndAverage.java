package project0812;

public class SumAndAverage {
    //여러 숫자의 합과 평균 구하기 (가변인자 사용)

    public static int sum (int... numbers) {
        int total = 0;
        //가변인자는 배열로 들어옴
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    //평균값은 실수형 반환
    public static double average(int... numbers) {
        //명시적 형변환
        return (double) sum(numbers) / numbers.length;
    }

    public static void main(String[] args) {

        System.out.println("합: " + sum(1,6,7,34,40));
        System.out.println("평균: " + average(1,6,7,34,40));
    }
}
