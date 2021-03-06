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
        Filter<List<Person>> ageFilter = new AgeFilter();
        Filter<List<Person>> sexFilter = new SexFilter();
        FilterChain<List<Person>> filterChain = new AbstractFilterChain<>();
        filterChain.addFilter(ageFilter);
        filterChain.addFilter(sexFilter);
        filterChain.doFilter(personList);
        System.out.println(personList);
    }
}
