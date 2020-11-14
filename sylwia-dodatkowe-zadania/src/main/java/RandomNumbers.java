import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int c;
//        int temp;

        System.out.println("Losuję liczby z zakresu od 0 do 30");
        c = getCountOfRandomNumber(5000);
        System.out.println("Byłem w pętli: " + c);
    }

    public static int getCountOfRandomNumber(int max) {
        int x = 0;
        int y = 30;

        Random random = new Random();
        int count = 0;
        int sum = 0;

        while (sum < max) {
            int temp = random.nextInt(31);
            sum += temp;
            count++;
            if (temp < y) {
                y = temp;
            }
            if (temp > x) {
                x = temp;
            }
        }
        System.out.println("Największa wylosowana liczba to " + x);
        System.out.println("Najmniejsza wylosowana liczba to " + y);
        return count;
    }
}