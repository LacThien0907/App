import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args){

        String text = "Hello java regex 2-12-2018, hello world 12/12/2018";
        String regex = "\\d{1,2}[\\-\\/]\\d{2}[\\-\\/]\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Ngày tháng trong chuỗi text: " + text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

        String text1 = "Tôi có 2 địa chỉ email đó là: huutrongpro@gmail.com và solacthien@gmail.com";
        String regex1 = "[a-zA-Z]\\w+@\\w+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(text1);

        System.out.println("Địa chỉ email tìm thấy trong text1: " + text1);
        while (m1.find()) {
            System.out.println(text1.substring(m1.start(), m1.end()));
        }


    }


}




    }
}
