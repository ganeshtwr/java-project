package Java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[]) {
        List<Emp> list = new ArrayList<>();
        Emp emp1 = new Emp(1, "Emp1", 10000);
        Emp emp2 = new Emp(2, "Emp2", 50000);
        Emp emp21 = new Emp(2, "Emp2", 50000);
        Emp emp3 = new Emp(3, "Emp3", 30000);
        Emp emp4 = new Emp(4, "Emp4", 20000);
        Emp emp5 = new Emp(5, "Emp5", 20000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp21);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println("List size : " + list.size());

        double avgSalary = list.stream().mapToInt(Emp::getSalary).average().getAsDouble();

        List<String> nameList = list.stream()
                .filter(e -> (e.getId() < 5 && e.getSalary() > avgSalary))
                .map(Emp::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        System.out.println("Count :: " + list.stream()
                .filter(e -> (e.getId() < 5 && e.getSalary() > avgSalary))
                .count());

        System.out.println("Sum :: " + list.stream()
                .mapToInt(Emp::getSalary)
                .sum());

        System.out.println("Avg :: " + list.stream()
                .mapToInt(Emp::getSalary)
                .average().getAsDouble());

        System.out.println("Max :: " + list.stream()
                .mapToInt(Emp::getSalary)
                .max().getAsInt());

        System.out.println("Min :: " + list.stream()
                .mapToInt(Emp::getSalary)
                .min().getAsInt());

        System.out.println("Unique element :: ");
        list.stream()
                .mapToInt(Emp::getSalary)
                .distinct().forEach(System.out::println);

        System.out.println("Asc Sorting :: ");
        list.stream()
                .mapToInt(Emp::getSalary)      // For number has to use mapToXXX()
                //.map(Emp::getName)             // For string just use map()
                .sorted().forEach(System.out::println);

        System.out.println("Desc Sorting :: ");
        list.stream()
                //.mapToInt(Emp::getSalary)    // For number has to use mapToXXX()
                .map(Emp::getName)              // For string just use map()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Limit 2 :: ");
        list.stream()
                .mapToInt(Emp::getSalary)
                .sorted()
                .limit(2).forEach(System.out::println);
    }
}
