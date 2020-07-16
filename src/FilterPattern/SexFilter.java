package FilterPattern;

import java.util.List;

public class SexFilter implements Filter<Person> {
    @Override
    public void doFilter(List<Person> list, FilterChain<Person> filterChain) {
        list.removeIf(person -> (person).getSex().equals("男"));
        filterChain.doFilter(list);
    }
}
