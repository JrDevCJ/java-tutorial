import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class ConvertDateToOffsetDateTime {

    public static void main(String[] args) {

        Date date = new Date();

        Instant instant = date.toInstant();
        ZoneOffset offset = ZoneOffset
                .of("-03:00");

        OffsetDateTime offsetDateTime = OffsetDateTime
                .ofInstant(instant, offset);

        System.out.println("Date: " + date);
        System.out.println("OffsetDateTime: " + offsetDateTime);

    }

}