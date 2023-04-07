import org.apache.commons.lang3.StringUtils;

public class Method {

    public static String abbr(String text, int length) {
        return StringUtils.abbreviate(text, length);
    }

    public static int sum(Integer first, int second) {
        int sum = first + second;

        return sum;
    }


}