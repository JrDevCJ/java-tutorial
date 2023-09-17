public class ConvertIntToLong {

    public static void main(String[] args) {

        // Usando cast
        int intValue = 10;
        Long longValue = (long) intValue;

        // Usando o Cnstrutor da classe long
        longValue = new Long(intValue);

        // Usando o metódo valueOf da classe long
        longValue = Long.valueOf(intValue);

       System.out.println("int " + intValue);
       System.out.println("long " + longValue);
      

    }
    
}
