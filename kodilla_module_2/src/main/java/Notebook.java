public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("Ten laptop jest podejżanie tani.");
        } else {
            if ((this.price > 600) && (this.price < 2000)){
                System.out.println("To jest dobra cena za laptop.");
            }
            if (this.price > 2000) {
                System.out.println("Ten laptop jest za drogi.");
            }
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("To jest bardzo lekki laptop.");
        } else {
            if ((this.weight > 1000) && (this.weight < 2000)){
                System.out.println("Ten laptop nie jest ani lekki, ani ciężki.");
            }
            if (this.weight > 2000) {
                System.out.println("Ten laptop jest dość ciężki.");
            }
        }
    }
    public void checkYear() {
        if (this.year < 2010) {
            System.out.println("To jest bardzo stary laptop.");
        } else {
            if ((this.year > 2010) && (this.year < 2019)){
                System.out.println("To jeden z nowszych laptopów, ale nie najnowszy model.");
            }
            if (this.year > 2019) {
                System.out.println("To jest najnowszy model laptopa.");
            }
        }
    }
    public void checkYearAndPrice() {
        if ((this.year > 2019) && (this.price < 2000)) {
            System.out.println("OKAZJA! Kupujemy nowy laptop!");
        } else {
            System.out.println("Poszukajmy w innym sklepie :( ");
        }
    }
}