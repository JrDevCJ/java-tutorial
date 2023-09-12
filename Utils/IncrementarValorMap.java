import java.util.HashMap;
import java.util.Map;

public class IncrementarValorMap {

    public static void main(String[] args) {

        Map<String, Integer> hasMap =
            new HashMap<>();
        
        hasMap.put("A", 1);
        System.out.println(hasMap);

        hasMap.merge("A", 1, Integer::sum);
        hasMap.merge("B", 1, Integer::sum);
        hasMap.merge("A", 1, Integer::sum);

        System.out.println(hasMap);


   

   
    }

}
