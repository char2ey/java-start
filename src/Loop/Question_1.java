package Loop;

public class Question_1 {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }

    public static void forLoop() {
        for(int count = 1; count <= 10; count++){
            System.out.println("For Loop : " + count);
        }
    }

    public static void whileLoop() {
        int count = 1;

        while(count <= 10){
            System.out.println("While Loop : " + count);
            count++;
        }
    }
}
