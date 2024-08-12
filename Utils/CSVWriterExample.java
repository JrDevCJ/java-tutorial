import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriterExample {

    public static void main(String[] args) {
        String csvFile = "output.csv";
        try (PrintWriter writer = 
        new PrintWriter(new FileWriter(csvFile))) {
  
            writer.println("Nome,Idade,Cidade");
            
            writer.println("João,25,São Paulo");
            writer.println("Maria,30,Rio de Janeiro");
            writer.println("Pedro,28,Belo Horizonte");

            System.out.println("Arquivo CSV criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
