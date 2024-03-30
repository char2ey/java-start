package Loop;

public class Question_4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("                               ");
            System.out.println(i + "단 입니다.");
            System.out.println("===============================");
        }
    }
}
