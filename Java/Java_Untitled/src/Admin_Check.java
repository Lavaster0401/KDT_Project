public class Admin_Check {
    public static void main(String[] args) {
        String userId = "Admin";
        String userInput = "AdMiN";

        //equalsIgnoreCase는 대소문자를 구분하지 않고 비교하는 메서드
        if(userId.equalsIgnoreCase(userInput)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("아이디가 일치하지 않습니다.");
        }

    }
}