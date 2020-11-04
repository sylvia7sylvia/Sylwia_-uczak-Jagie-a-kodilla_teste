import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSetDemo {
    public static void main(String[] args) {
        Map<String, Set<Integer>> stringSetMap = new HashMap<>();
        Set<Integer> integers = new HashSet<>();
        integers.add(40);
        integers.add(50);
        integers.add(60);
        integers.add(30);
        stringSetMap.put("Kwiaty",integers);


        System.out.println(stringSetMap.get("Kwiaty").contains(40));
    }
}
