package Java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {
    public static void main(String[] args) {

        // Case 1 { a=apple, b=banana, o=orange }
        Stream<String> stream = Stream.of("apple", "banana", "orange");
        Map<Character, String> m = stream.collect(Collectors.toMap(s1 -> s1.charAt(0), s1 -> s1));

        // Case 2 { 1=A, 2=B, 3=C, 4=D,E }
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "A"));
        list.add(new Student(2, "B"));
        list.add(new Student(3, "C"));
        list.add(new Student(4, "D"));
        list.add(new Student(4, "E"));

        // Convert the Student list to Map using toMap() method
        // Map<Integer, Student> map = list.stream().collect(Collectors.toMap(s->s.getId() , s->s));

        System.out.println(list.stream().collect(Collectors.toMap(Student::getId, Student::getName)));
        System.out.println(list.stream().collect(Collectors.toMap(s -> s.getId(), s -> s.getName())));
        System.out.println(list.stream().collect(Collectors.toMap(s -> s.getId(), s -> s)));

        // Duplicate objects with different values
        System.out.println(list.stream().collect(Collectors.toMap(s -> s.getId(), s -> s.getName(), (s, a) -> s + ", " + a)));

        // If you want to create a new HashMap type, LinkedHashMap, ConcurrentHashMap, etc.
//        System.out.println(list.stream().collect(Collectors.toMap(
//                s -> s.getId(), s -> s.getName(), (s, a) -> s + ", " + a, LinkedHashMap::new)));
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
