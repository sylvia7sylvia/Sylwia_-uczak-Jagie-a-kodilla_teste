public class SimpleArray {
    public static void main(String[] args) {

        String[] elements = new String[5];
        elements[0] = "Wodór";
        elements[1] = "Hel";
        elements[2] = "Lit";
        elements[3] = "Beryl";
        elements[4] = "Bor";

        int numberOfElements = elements.length;

        String element = elements [2];
        System.out.println(element);
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}