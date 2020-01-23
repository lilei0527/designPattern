package FilterPattern;

import java.util.List;

/*拦截器链*/
public interface FilterChain {
    void addFilter(Filter filter);
    void doFilter(List<Person> list);
}
