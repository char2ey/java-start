package Condition;

public class Question_2 {
    public static void main(String[] args) {
        int distance = 5;

        if(distance <= 1){
            System.out.println("도보");
        } else if (distance <= 10){
            System.out.println("자전거");
        } else if (distance <= 100){
            System.out.println("자동차");
        } else if (distance <= 1000){
            System.out.println("비행기");
        }
    }
}
