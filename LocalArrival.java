import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.Month.*;

public class LocalArrival {

    static LocalDateTime arrival(ZonedDateTime depature, Duration flightTime) {
        ZoneId here = ZoneId.systemDefault();
        ZonedDateTime hereDeparture = depature.withZoneSameInstant(here);
        return hereDeparture.plus(flightTime).toLocalDateTime();

    }

    public static void main(String[] args) {
        ZonedDateTime harareDepature = ZonedDateTime.of(
                LocalDateTime.of(2015, DECEMBER, 1, 9, 15),
                ZoneId.of("Africa/Harare"));
        Duration harareFlightTime = Duration.ofHours(20);
        LocalDateTime arrival = arrival(harareDepature, harareFlightTime);
        System.out.println(arrival);
    }
}
