import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
//
//        String regex = "^(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}$";
//        Pattern p = Pattern.compile(regex);
//        String input = "0343155244, 0343 155 244, 0343-155-244, 0343.155.244";
//        Matcher m = p.matcher(input);
//
//        boolean matchFound = m.find();
//        while (matchFound){
//            String phone = input.substring(m.start(), m.end());
//            System.out.println(phone);
//            matchFound = m.find();
//        }

        String text = "Hello java regex 2-12-2018, hello world 12/12/2018";
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Ngày tháng trong chuỗi text: " + text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

        String text1 = "Tôi có 2 địa chỉ email đó là: huutrongpro@gmail.com và solacthien@gmail.com";
        String regex1 = "/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$/gm";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p.matcher(text1);

        System.out.println("Địa chỉ email tìm thấy trong text1: " + text1);
        while (m1.find()) {
            System.out.println(text1.substring(m1.start(), m1.end()));
        }



    }
}
