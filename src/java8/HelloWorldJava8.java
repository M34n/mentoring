package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HelloWorldJava8 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Andrey", 31));
        list.add(new Person("Artur", 24));
        list.add(new Person("Fedor", 27));
        Comparator<Person> personComparatorByAge = Comparator.comparing(Person::getAge);
        Comparator<Person> personComparatorByName = Comparator.comparing(Person::getName);

        list.stream().sorted(personComparatorByAge).forEach(System.out::println);
        list.stream().sorted(personComparatorByName).forEach(System.out::println);
    }
}
