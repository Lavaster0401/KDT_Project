package project0813;

public class BankAccount {
    // 필드 (캡슐화)
    private String accountNumber; // 계좌번호
    private String owner;         // 예금주
    private int money;          // 잔액

    //생성자
    public BankAccount(String accountNumber, String owner, int money) {
        if (money < 0) {
            System.out.println("잔액은 0원 이상이어야 합니다.");
        }
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.money = money;
    }

    // 입금
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("0원 보다 큰 금액만 입금 가능합니다.");
            return;
        }
        money += amount;
        //입금확인용
        System.out.println(owner + "님의 계좌에 "+ amount + "원이 입금되었습니다. 현재 잔액: " + money + "원");
    }

    //출금
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("0원 보다 큰 금액만 출금 가능합니다.");
            return;
        }
        if (amount > money) {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }
        money -= amount;
        System.out.println(owner + "님의 계좌에서 " + amount + "원이 출금되었습니다. 현재 잔액: " + money + "원");
    }

    // 잔액 확인
    public void getMoney() {
        System.out.println(owner + "님 계좌의 현재 잔액: " + money + "원");
    }

    // 이체 메서드
    public void transferTo(BankAccount target, int amount) {
        if (target == null) {
            System.out.println("이체할 계좌가 존재하지 않습니다.");
            return;
        }
        if (amount <= 0) {
            System.out.println("0원 보다 큰 금액만 이체할 수 있습니다.");
            return;
        }
        if (amount > money) {
            System.out.println("잔액이 부족하여 이체할 수 없습니다.");
            return;
        }

        this.withdraw(amount);   // 출금
        target.deposit(amount);  // 입금
        System.out.println(owner + "님이 " + target.owner + "님에게 " + amount + "원을 이체했습니다.");
    }
}

