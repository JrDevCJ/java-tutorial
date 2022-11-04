
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiferencaListSet {

    public static void main(String args[]){ 

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("-- Items da Lista --");
        list.forEach(System.out::println);


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        System.out.println("-- Items do set --");
        set.forEach(System.out::println);

    }


}