package FilterPattern;


import java.util.List;

public interface Filter<T> {
    void doFilter(List<T> list, FilterChain<T> filterChain);
}
