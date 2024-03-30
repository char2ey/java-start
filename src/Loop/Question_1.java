package Loop;

public class Question_1 {
    public static void main(String[] args) {
        int count = 0;

        forLoop(count);

        whileLoop(count);
    }

    public static void forLoop(int count) {
        for(int i = 1; i <= 10; i++){
            count = i;
            System.out.println("For Loop : " + count);
        }
    }

    public static void whileLoop(int count) {
        int i = 1;

        while(i <= 10){
            count = i;
            System.out.println("While Loop : " + count);
            i++;
        }
    }
}
