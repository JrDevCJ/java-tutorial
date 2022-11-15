import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ColecoesGroupingBy {

    public static void main(String args[]){

        List<String> linguagens = Arrays.asList(
            "Java", "Python", "JavaScript",
            "Java", "JavaScript", "Python", "Java"
        );

        Map<String, Long> resultado = linguagens.stream().collect(
            Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )
        );

        System.out.println("List Resultado Agrupado:");
        System.out.println(resultado);        


    }

}
