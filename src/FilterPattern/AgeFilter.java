package FilterPattern;

import java.util.List;

public class AgeFilter implements Filter<List<Person>> {

    @Override
    public void doFilter(List<Person> people, FilterChain<List<Person>> filterChain) {
        people.removeIf(person -> (person).getAge() > 5);

        filterChain.doFilter(people);
    }
}
