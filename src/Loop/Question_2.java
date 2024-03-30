package Loop;

public class Question_2 {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }

    public static void forLoop(){
        for(int num = 2; num <= 20; num += 2){
            System.out.println(num);
        }
    }

    public static void whileLoop(){
        int num = 2;
        while(num <= 20){
            System.out.println(num);
            num += 2;
        }
    }
}
