import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Tommaso", "Giulia", "Federico", "Giada", "Eduard", "Tommaso", "Giulia");
        List<Integer> lengths = names.stream()
                .map(name -> name.length())

                .collect(Collectors.toList());





        System.out.println(lengths);

    }
    public static String upperCase (String name){
        return name.toUpperCase();
    }

    static boolean endsWithA(String value) {
        return value.endsWith("a");
    }
}
