package FilterPattern;

import java.util.List;

/*拦截器链*/
public interface FilterChain<T> {
    void addFilter(Filter<T> filter);
    void doFilter(List<T> list);
}
