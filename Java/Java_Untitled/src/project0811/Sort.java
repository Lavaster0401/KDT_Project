package project0811;

public class Sort {
    public static void main(String[] args) {
        String[] words = {"cherry", "banana","apple"};


        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                //compareTo는 같은 문자열 일 경우에는 0을 반환
                //양수가 나왔을 경우에는 기준 문자열이 비교 문자열 보다 사전상 더 앞에 나오는 문자열이니 위치 교체
                //선택정렬 사용
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("정렬 완료:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}