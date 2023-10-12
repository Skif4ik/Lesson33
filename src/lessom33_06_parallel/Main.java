package lessom33_06_parallel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Tom", "Bob", "Tim", "Kate", "Sam", "Vasia"
        );

        list.stream()
                .filter(it -> it.length()==3)
                .forEach(it -> System.out.print(it + " "));

        System.out.println();

        list.parallelStream()
                .filter(it -> it.length()==3)
                .forEach(it -> System.out.print(it + " "));
    }
}
