package Lab17and18.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public void main() {
        String input = " 22 UDD, 0.002 USD, 23.78 USD, 34 RUR, 46.9 EU, 3656.99 RUR 969.699 RUR";
        System.out.println("Список цен: \""+ input+" \"");
        Pattern pattern = Pattern.compile("(([0-9]{1,}\\.[0-9]{1,2}\\s)|(\\s[0-9]{1,}\\s))+(USD|RUR|EU)");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Подходящие под шаблон цены: ");
        while(matcher.find())
            System.out.println(matcher.group());
    }
   }