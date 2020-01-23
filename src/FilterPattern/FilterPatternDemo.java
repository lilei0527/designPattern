package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/*过滤器模式*/
public class FilterPatternDemo {
    public static void main(String[] args) {
        Person person = new Person("男", 12, "小明");
        Person person1 = new Person("女", 2, "小李");
        Person person2 = new Person("女", 3, "小王");
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        Filter ageFilter = new AgeFilter();
        Filter sexFilter = new SexFilter();
        FilterChain filterChain = new PersonFilterChain();
        filterChain.addFilter(ageFilter);
        filterChain.addFilter(sexFilter);
        filterChain.doFilter(personList);
        System.out.println(personList);
    }
}
