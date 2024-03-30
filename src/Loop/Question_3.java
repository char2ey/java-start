package Loop;

public class Question_3 {
    public static void main(String[] args) {
        int max = 100;
        forLoop(max);
        whileLoop(max);
    }

    public static void forLoop(int max) {
        for(int i = 1, count = 0; i <= max; i++){
            count += i;
            if( i == max){
                System.out.println("결과 : " + count);
            }
        }
    }

    public static void whileLoop(int max) {
        int i = 1, count = 0;
        while(i <= max){
            count += i;
            i++;
        }
        System.out.println("결과 : " + count);
    }
}
