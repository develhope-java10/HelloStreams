import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Tommaso", "Giulia", "Federico", "Giada", "Eduard", "Tommaso", "Giulia");
        List<String> result = names.stream()
                //.filter(Main::endsWithA)
                //.map(String::length)
                .distinct()
                .map(Main::upperCase)
                .collect(Collectors.toList());

        System.out.println(result);

    }
    public static String upperCase (String name){
        return name.toUpperCase();
    }

    static boolean endsWithA(String value) {
        return value.endsWith("a");
    }
}
