package pl.kciamaga.java8desktop;

public class StringUtils {



    static double toDouble(String number) {

        return Double.parseDouble(number.replace(',', '.'));
    }



}