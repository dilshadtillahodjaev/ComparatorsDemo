import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lottoapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set sum 0;
        while (numbers.size()<3) {
            int number = scanner.nextInt();
            sum+=number;
            number.add(number);
        }
        numbers.forEach(System.out::println);
        System.out.println(sum/numbers.sie());

        List<String> words = new ArrayList<>();
        while (true) {
            String word = scanner.next();
            words.add(word+=" ");
            if(word.endsWith(".")) {
                break;
            }
        }
        words.forEach(System.out::println);
    }
}
