public class ConcatenarString {

    public static void main(String args[]){ 

        String stringUm = "Dev";
        String stringDois = "Junior";

        //Usando o operador (+) 
        System.out.println("--- Usando o operador (+) ---");
        System.out.println(stringUm + stringDois);        

        //Usando o metódo (concat)
        System.out.println("--- Usando o metódo (concat) ---");
        System.out.println(stringUm.concat(stringDois));
        
        //Usando o metódo (join) * apartir do Java 8+ 
        System.out.println("--- Usando o metódo (join) ---");
        System.out.println(String.join("", stringUm, stringDois));

    }

}