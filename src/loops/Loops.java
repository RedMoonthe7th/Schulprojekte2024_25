package loops;

public class Loops {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a = a + i;
        }
        System.out.println("Answer: " + a);

        a = 0;
        for (int i = 1; i <= 30; i++) {
            if(i%3==0) {
                a = a + i;
            }
            
        }
        System.out.println("Answer: " + a);

        a = 0;
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                System.out.println("Answer: " + i);
            }
        }

        a = 0;
        for (int i = 1; i <= 20; i++) {
            if(i%2!=0){
                System.out.println("Answer: " + i);
            }
        }

        a = 0;
        for (int i = 10; i >= 1; i--) {
                System.out.println("Answer: " + i);
        }
        
        a = 0;
        for (int i = 1; i <= 5; i++) {
            a = a + i * i;
        }
        System.out.println("Answer: " + a);

        a = 0;
        for (int i = 1; i <= 100; i++) {
            a = a + i;
        }
        System.out.println("Answer: " + a);

        a = 1;
        for (int i = 1; i <= 5; i++) {
            a = a * i;
        }
        System.out.println("Answer: " + a);
    }
}