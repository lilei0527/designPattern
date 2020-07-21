package FilterPattern;

import java.util.List;

public class SexFilter implements Filter<List<Person>> {
    @Override
    public void doFilter(List<Person> people, FilterChain<List<Person>> filterChain) {
        people.removeIf(person -> (person).getSex().equals("男"));
        filterChain.doFilter(people);
    }
}
