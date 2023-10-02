import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EpochTimeLocalDateTime {

    public static void main(String[] args) {

        long epochTime = 1664913451000L;
        Instant instant = Instant
                    .ofEpochMilli(epochTime);

        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant
            .atZone(zoneId).toLocalDateTime();

        String datePattern = "dd-MM-yyyy HH:mm:ss";

        DateTimeFormatter format = DateTimeFormatter
            .ofPattern(datePattern);

        String formattedDateTime = localDateTime
            .format(format);

        System.out.println("epochTime: " + epochTime);
        System.out.println("localDateTime: " + formattedDateTime);



    }

}

// 