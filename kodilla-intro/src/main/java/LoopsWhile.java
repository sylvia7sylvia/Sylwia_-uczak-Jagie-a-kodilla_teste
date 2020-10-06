import java.util.Random;
public class LoopsWhile {
    public static void main(String[] args) {
        int c = 0;
        c = getCountOfRandomNumber(10);
        System.out.println("Ile razy byłem w pętli while " + c);
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            System.out.println("Wylosowałem cyfrę " +temp);
            sum = sum + temp;
            System.out.println("Cyfra "+temp+" Suma z poprzednią "+sum);
            result++;
        }
        return result;
    }
        /*
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++
            }
         */
}