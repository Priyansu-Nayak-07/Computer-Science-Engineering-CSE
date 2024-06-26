package assignment9;

import java.time.*;
public class q11 {
public static void main(String[] args) {
String utcDateTimeString = "2023-03-14T15:30:00Z";
Instant instant = Instant.parse(utcDateTimeString);
ZoneId zoneId = ZoneId.of("America/New_York");
ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
System.out.println("Local date and time in America/New_York time zone: " + zonedDateTime);
}
}