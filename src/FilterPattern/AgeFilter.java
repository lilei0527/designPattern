package FilterPattern;

import java.util.List;

public class AgeFilter implements Filter {

    @Override
    public void doFilter(List<Person> list, FilterChain filterChain) {

        list.removeIf(person -> (person).getAge() > 5);

        filterChain.doFilter(list);
    }
}
