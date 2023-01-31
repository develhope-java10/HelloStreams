import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Tommaso", "Giulia", "Federico", "Giada", "Eduard");
        List<Integer> result = names.stream()
                .filter(Main::endsWithA)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    static boolean endsWithA(String value) {
        return value.endsWith("a");
    }
}
