package com.bookingservice.utils;

public interface Constants {

    String EXIT = "0";

    String DATA_FILE_FLIGHTS = "data/flights.txt";

    String DATA_FILE_BOOKINGS = "data/bookings.txt";

    String DATA_FILE_USERS = "data/users.txt";

    String DATA_FILES_LOG = "data/logs.log";

    String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm";

    String TIME_ZONE = "Europe/Kiev";

    String DATE_FORMAT_REGEX = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";

    String BREAK_ACTION = "Break action!";

    String INVALID_DATA = "Invalid data!";

    String CITY_FROM = "Kiev";

    String[] CITIES_TO = {
            "Minsk",
            "Grodno",
            "Moscow",
            "Bratislava",
            "Budapest",
            "Rome",
            "Gent",
            "Brussels",
            "London",
            "Warsaw",
            "Prague",
            "Kosice",
            "Paris",
            "Berlin",
            "Barcelona",
            "Danzig",
            "Gdansk",
            "Naples",
            "Cairo",
            "Vladivostok",
            "Tokyo", "" +
            "Beijing",
            "Sydney",
            "Dubai",
            "New-York",
            "Hong-Kong",
            "Washington"
    };

}