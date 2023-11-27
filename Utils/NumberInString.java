public class NumberInString {

    public static void main(String[] args) {

        boolean semNumero;
        boolean comNumero;

        // Usando String Metodo(matches)
        semNumero = "ABCDEF".matches(".*\\d.");
        System.out.println(semNumero);

        comNumero = "ABC123".matches(".*\\d.");
        System.out.println(comNumero);
     
         // Usando Stream API
         semNumero="ABCDEF".chars()
            .anyMatch(Character::isDigit);
        System.out.println(semNumero);

        comNumero = "ABC123".chars()
            .anyMatch(Character::isDigit);

        System.out.println(comNumero);
 

       

    }

}
