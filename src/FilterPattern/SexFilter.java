package FilterPattern;

import java.util.List;

public class SexFilter implements Filter {
    @Override
    public void doFilter(List<Person> list, FilterChain filterChain) {
        list.removeIf(person -> (person).getSex().equals("男"));
        filterChain.doFilter(list);
    }
}
