package Condition;

public class Question_3 {
    public static void main(String[] args) {
        int dollarToWon = 1300;

        int dollar;

        dollar = 10;

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if(dollar > 0){
            System.out.println("환전 금액은" + dollar * dollarToWon + "원입니다.");
        }
    }
}
