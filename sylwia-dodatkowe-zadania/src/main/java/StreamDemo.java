import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Wodór", "Hel","" , "Beryl", "", "", "Azot", "Argon", "Antymon");
        lista.stream().filter(s -> !s.isEmpty()).forEach(s -> System.out.println(s));
        System.out.println("----");
        lista.stream().filter(a -> a.startsWith("A")).forEach(g -> System.out.println(g));
        System.out.println("----");
        lista.stream().filter(b -> b.length() > 4).forEach(h -> System.out.println(h));
        System.out.println("----");
        lista.stream().filter(s -> !s.isEmpty()).forEach(z -> System.out.println(z + ": jego stan skupienia to: " + isGas(z)));
        System.out.println("----");
    }
    public static String isGas(String element) {
        Map<String, String> stayElementMap = new HashMap<>();
        stayElementMap.put("Wodór", "gaz");
        stayElementMap.put("Hel", "gaz");
        stayElementMap.put("Azot", "gaz");
        return stayElementMap.getOrDefault(element, "nieznany");
    }

}
