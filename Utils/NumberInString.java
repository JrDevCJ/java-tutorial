public class NumberInString {

    public static void main(String[] args) {

        boolean semNumero;
        boolean comNumero;
     
         // Usando Stream API

         semNumero="ABCDEF".chars()
            .anyMatch(Character::isDigit);
        System.out.println(semNumero);

        comNumero = "ABC123".chars()
            .anyMatch(Character::isDigit);

        System.out.println(comNumero);
 

       

    }

}
