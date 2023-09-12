public class CompararString {

    public static void main(String[] args) {

        String valor1 = "abc";
        String valor2 = new String("abc");
        
        System.out.println("Comparado com == :" + (valor1 == valor2));
        System.out.println("Comparado com equals :" + valor1.equals(valor2));

  
    }
    
}
