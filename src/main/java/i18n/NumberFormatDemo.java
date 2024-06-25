package i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double money = 12345666666.789;
        Locale vi = new Locale("vi");
        Locale ja = new Locale("ja");
        String s1 = formatNumberByLocale(money, vi);
        System.out.println("s1 = " + s1);
        String s2 = formatNumberByLocale(money, ja);
        System.out.println("s2 = " + s2);
    }

    public static String formatNumberByLocale(double number, Locale locale) {
        NumberFormat formatter = NumberFormat.getInstance(locale);
        return formatter.format(number);
    }


}
