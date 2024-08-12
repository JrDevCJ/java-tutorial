import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {

    public static void main(String[] args) {
        String csvFile = "output.csv";
        String line;
        String csvSeparator = ",";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

            if ((line = reader.readLine()) != null) {
                System.out.println("Cabeçalho: " + line);
            }

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(csvSeparator);

                String nome = data[0];
                String idade = data[1];
                String cidade = data[2];

                System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
