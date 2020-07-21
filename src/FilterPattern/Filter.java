package FilterPattern;


import java.util.List;

public interface Filter<T> {
    void doFilter(T t, FilterChain<T> filterChain);
}
