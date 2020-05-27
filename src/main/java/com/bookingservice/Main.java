package com.bookingservice;

import com.bookingservice.utils.CrunchifyJSONReadFromFile;
import com.bookingservice.utils.Parser;
import com.bookingservice.view.ConsoleView;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {

        new ConsoleView().run();

//        CrunchifyJSONReadFromFile jsonReadFromFile = new CrunchifyJSONReadFromFile("src/main/resources/json/trello.json");
//        String jsonObject = jsonReadFromFile.getStringFromFile();
//
//        Parser parser = new Parser();
//
//        parser.getArrayItemsBySubArrayName(jsonObject.toString(), "id");

        // Данные, которые вводятся в WEB поля для проверки валидаций:
        /**
         * null
         * NaN
         * undefined
         * true
         * false
         * {}
         * `~!@#$%^&*()_+-={[}]:"|;'\<>?,./|\</>№
         * вводите UTF символы с редких языков (в браузере ввести Символ Ракета 🚀)
         * эмодзи
         * ПРОБЕЛЫ - много вводим от 1 до 10000
         * sql-inj: ' or 1=1; --
         * xss: <input type='submit'>
         * 10000+ символов ввести
         * for numeric ->
         *                  12.12
         *                  21212
         *                  1
         *                  111.
         *                  .21
         *                  .000000
         *                  .212313171653173
         *                  .00000000000000000000001
         *                  0.12121212
         *                  0.00000000000001
         *                  3e2 //= 3 * 100 = 300
         *                  099292929
         *                  02323232323.23233
         *                  02323.000000
         *                  000000.000000
         *                  232423232323232323242424242424244244242424242424242424244
         *                  -12122
         *                  +1212212
         *                  +0
         *                  -0
         *                  0
         *                  0.0
         */

    }

}