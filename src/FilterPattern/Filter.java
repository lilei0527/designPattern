package FilterPattern;


import java.util.List;

public interface Filter {
    void doFilter(List<Person> list, FilterChain filterChain);
}
